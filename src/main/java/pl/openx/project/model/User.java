package pl.openx.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Address address;
    private int id;
    private String email;
    private String username;
    private String password;
    private Name name;
    private String phone;
    private int __v;

    public double calculateDistance(User otherUser) {
        return this.getAddress().getGeolocation().calculateDistance(otherUser.getAddress().getGeolocation());
    }

}
