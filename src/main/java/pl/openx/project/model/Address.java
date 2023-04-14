package pl.openx.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Geolocation geolocation;
    private String city;
    private String street;
    private int number;
    private String zipcode;

}