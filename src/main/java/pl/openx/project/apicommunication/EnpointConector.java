package pl.openx.project.apicommunication;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public  class EnpointConector extends JsonService{

    public static <T> List<T> getAll(Class<T> clazz, String url) {
        String json = null;
        try {
            json = getJsonFromUrl(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Type listType = new TypeToken<List<T>>(){}.getType();
        List<T> list = gson.fromJson(json, listType);
        return list;
    }

}
