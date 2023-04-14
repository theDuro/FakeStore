import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import pl.openx.project.apicommunication.CardEndpointConector;
import pl.openx.project.apicommunication.ProductEndpointConector;
import pl.openx.project.apicommunication.UserEndpointConector;
import pl.openx.project.model.*;
import pl.openx.project.services.ShopService;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopServiceTest {

    private ShopService shopService;

    private CardEndpointConector cardEndpointConectorMock;
    private ProductEndpointConector productEndpointConectorMock;
    private UserEndpointConector userEndpointConectorMock;

    @BeforeEach
    public void setUp() {
        cardEndpointConectorMock = Mockito.mock(CardEndpointConector.class);
        productEndpointConectorMock = Mockito.mock(ProductEndpointConector.class);
        userEndpointConectorMock = Mockito.mock(UserEndpointConector.class);

        shopService = new ShopService();

        try {
            FieldUtils.writeField(shopService, "cardEndpointConector", cardEndpointConectorMock, true);
            FieldUtils.writeField(shopService, "productEndpointConector", productEndpointConectorMock, true);
            FieldUtils.writeField(shopService, "userEndpointConector", userEndpointConectorMock, true);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getUsersWithMaxDistance(){
        Mockito.when(userEndpointConectorMock.getAll()).thenReturn(ShopServiceTestUtils.getUserList());
        User user1 = new User(
                new Address(new Geolocation(34.052, -118.243), "Los Angeles", "Hollywood Blvd", 789, "90028"),
                3,
                "bob.johnson@example.com",
                "bobjohnson",
                "password",
                new Name("Bob", "Johnson"),
                "789-012-3456",
                0
        );

        User user2 = new User(
                new Address(new Geolocation(37.422, -122.084), "San Francisco", "Market St", 123, "94102"),
                1,
                "john.doe@example.com",
                "johndoe",
                "password",
                new Name("John", "Doe"),
                "123-456-7890",
                0
        );

        UserPair userPair = new UserPair(user1, user2);
        assertEquals(userPair,shopService.getUsersWithMaxDistance());

    }
    @Test
    public void getCategoriesValueTest(){
        Mockito.when(productEndpointConectorMock.getAll()).thenReturn(ShopServiceTestUtils.getProductList());
        Map<String, BigDecimal> products = new HashMap<>();
        products.put("Fashion", new BigDecimal("129.99"));
        products.put("Electronics", new BigDecimal("3269.94"));
        products.put("Outdoors", new BigDecimal("149.98"));
        products.put("Sports", new BigDecimal("89.99"));
        assertEquals(products,shopService.getCategoriesValue());

    }
    @Test
    public void maxCartInfoTest(){
        Mockito.when(cardEndpointConectorMock.getAll()).thenReturn(ShopServiceTestUtils.getCaerds());
        Mockito.when(productEndpointConectorMock.getAll()).thenReturn(ShopServiceTestUtils.getProductList());
        Mockito.when(userEndpointConectorMock.getAll()).thenReturn(ShopServiceTestUtils.getUserList());
        MaxCartInfo maxCartInfo = new MaxCartInfo(BigDecimal.valueOf(5449.85),"johndoe");

      assertEquals(maxCartInfo,shopService.getMaxCartInfo());
    }


}
