package pl.openx.project.apicommunication;

import com.google.gson.reflect.TypeToken;
import pl.openx.project.model.Address;
import pl.openx.project.model.Geolocation;
import pl.openx.project.model.Name;
import pl.openx.project.model.User;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserEndpointConector extends JsonService {
    private static List<User> users =null;
    public List<User> getAll()  {
        if (users == null) {
            String json = null;
            try {
                json = getJsonFromUrl(FakeStoreApiUrl.USERS.getUrl());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Type listType = new TypeToken<ArrayList<User>>() {
            }.getType();
            users = gson.fromJson(json, listType);
        }
        return users;
    }

}
