package pl.openx.project.apicommunication;

import pl.openx.project.model.Product;
import java.util.List;

public class ProductEndpointConector  {
    private static List<Product> products = null;
    public  List<Product> getAll() {
        if (products == null) {
           products = EnpointConector.getAll(Product.class,FakeStoreApiUrl.PRODUCTS.getUrl());
        }
        return products;
    }

}
