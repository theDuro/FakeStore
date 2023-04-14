package pl.openx.project.apicommunication;

import com.google.gson.reflect.TypeToken;
import pl.openx.project.model.Cart;
import pl.openx.project.model.ProductInfo;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CardEndpointConector   extends JsonService   {
    private static List<Cart> carts = null;

    public List<Cart> getAll()  {
        if (carts == null) {
            String json = null;
            try {
                json = getJsonFromUrl(FakeStoreApiUrl.CARTS.getUrl());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Type listType = new TypeToken<ArrayList<Cart>>() {
            }.getType();
            carts = gson.fromJson(json, listType);
        }
        return carts;
    }

}
