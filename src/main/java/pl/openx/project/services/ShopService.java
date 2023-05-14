package pl.openx.project.services;

import pl.openx.project.apicommunication.CardEndpointConector;
import pl.openx.project.apicommunication.ProductEndpointConector;
import pl.openx.project.apicommunication.UserEndpointConector;
import pl.openx.project.model.*;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ShopService {
    private final CardEndpointConector cardEndpointConector = new CardEndpointConector();
    private final ProductEndpointConector productEndpointConector = new ProductEndpointConector();
    private final UserEndpointConector userEndpointConector = new UserEndpointConector();

    public User getUserById(int id)  {
        return userEndpointConector.getAll().stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public UserPair getUsersWithMaxDistance() {
        return userEndpointConector.getAll().stream()
                .flatMap(user1 -> userEndpointConector.getAll().stream()
                        .map(user2 -> new UserPair(user1, user2)))
                .filter(pair -> !pair.pairEquals())
                .max(Comparator.comparingDouble(UserPair::calculateDistance))
                .orElse(null);
    }
    public BigDecimal getPriceById(int id) {
        return productEndpointConector.getAll().stream()
                .filter(e -> e.getId() == id).findFirst()
                .map(Product::getPrice)
                .orElse(null);
    }

    public Map<String, BigDecimal> getCategoriesValue() {
        return productEndpointConector.getAll().stream()
                .collect(groupingBy(Product::getCategory, Collectors.reducing(
                        BigDecimal.ZERO,
                        Product::getPrice,
                        BigDecimal::add)));
    }

    public Cart getCartById(int id)  {
        return cardEndpointConector.getAll().stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public BigDecimal getCartPriceById(int id)  {
        Cart cart = getCartById(id);
        if (cart == null) {
            return null;
        }
        return cart.getProductInfos().stream()
                .map(productInfo -> getPriceById(productInfo.getProductId())
                        .multiply(BigDecimal.valueOf(productInfo.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public MaxCartInfo getMaxCartInfo() {
        Comparator<Cart> cartComparator = (cart1, cart2) -> getCartPriceById(cart1.getId()).compareTo(getCartPriceById(cart2.getId()));
        return cardEndpointConector.getAll().stream()
                .max(cartComparator)
                .map(c -> new MaxCartInfo(getCartPriceById(c.getId())
                        , getUserById(c.getUserId()).getUsername()))
                .orElse(null);
    }





}
