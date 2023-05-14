package pl.openx.project.apicommunication;
import pl.openx.project.model.Cart;
import java.util.List;

public class CardEndpointConector      {
    private static List<Cart> carts = null;
    public  List<Cart> getAll()  {
        if (carts == null) {
           carts = EnpointConector.getAll(Cart.class,FakeStoreApiUrl.CARTS.getUrl());
        }
        return carts;
    }

}
