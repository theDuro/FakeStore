package pl.openx.project.apicommunication;

import com.google.gson.reflect.TypeToken;
import pl.openx.project.model.Product;
import pl.openx.project.model.Rating;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductEndpointConector extends JsonService {
    private static List<Product> products = null;
    public List<Product> getAll() {
        if (products == null) {
            String json = null;
            try {
                json = getJsonFromUrl(FakeStoreApiUrl.PRODUCTS.getUrl());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Type listType = new TypeToken<ArrayList<Product>>() {
            }.getType();

            products = gson.fromJson(json, listType);
        }

        return products;
    }

}
