package pl.openx.project.apicommunication;

import pl.openx.project.model.User;
import java.util.List;
public class UserEndpointConector  {
    private static List<User> users =null;
    public  List<User> getAll()  {
        if (users == null) {
           users = EnpointConector.getAll(User.class,FakeStoreApiUrl.USERS.getUrl());
        }
        return users;
    }

}
