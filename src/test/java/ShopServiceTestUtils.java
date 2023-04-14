import pl.openx.project.model.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShopServiceTestUtils {

    public static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("john.doe@example.com");
        user1.setUsername("johndoe");
        user1.setPassword("password");
        user1.setName(new Name());
        user1.getName().setFirstname ("John");
        user1.getName().setLastname( "Doe");
        user1.setPhone("123-456-7890");
        user1.setAddress(new Address());
        user1.getAddress().setGeolocation(new Geolocation());
        user1.getAddress().getGeolocation().setLat(37.422);
        user1.getAddress().getGeolocation().setMylong(-122.084);
        user1.getAddress().setCity("San Francisco");
        user1.getAddress().setStreet("Market St");
        user1.getAddress().setNumber(123);
        user1.getAddress().setZipcode("94102");
        user1.set__v(0);
        userList.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setEmail("jane.smith@example.com");
        user2.setUsername("janesmith");
        user2.setPassword("password");
        user2.setName(new Name());
        user2.getName().setFirstname("Jane");
        user2.getName().setLastname("Smith");
        user2.setPhone("456-789-0123");
        user2.setAddress(new Address());
        user2.getAddress().setGeolocation(new Geolocation());
        user2.getAddress().getGeolocation().setLat(40.712);
        user2.getAddress().getGeolocation().setMylong(-74.006);
        user2.getAddress().setCity("New York");
        user2.getAddress().setStreet("Broadway");
        user2.getAddress().setNumber(456);
        user2.getAddress().setZipcode("10001");
        user2.set__v(0);
        userList.add(user2);

        User user3 = new User();
        user3.setId(3);
        user3.setEmail("bob.johnson@example.com");
        user3.setUsername("bobjohnson");
        user3.setPassword("password");
        user3.setName(new Name());
        user3.getName().setFirstname("Bob");
        user3.getName().setLastname("Johnson");
        user3.setPhone("789-012-3456");
        user3.setAddress(new Address());
        user3.getAddress().setGeolocation(new Geolocation());
        user3.getAddress().getGeolocation().setLat(34.052);
        user3.getAddress().getGeolocation().setMylong(-118.243);
        user3.getAddress().setCity("Los Angeles");
        user3.getAddress().setStreet("Hollywood Blvd");
        user3.getAddress().setNumber(789);
        user3.getAddress().setZipcode("90028");
        user3.set__v(0);
        userList.add(user3);

        User user4 = new User();
        user4.setId(4);
        user4.setEmail("alice.wong@example.com");
        user4.setUsername("alicewong");
        user4.setPassword("password");
        user4.setName(new Name());
        user4.getName().setFirstname("Alice");
        user4.getName().setLastname("Wong");
        user4.setPhone("012-345-6789");
        user4.setAddress(new Address());
        user4.getAddress().setGeolocation(new Geolocation());
        user4.getAddress().getGeolocation().setLat(51.507);
        user4.getAddress().getGeolocation().setMylong(-0.127);
        user4.getAddress().setCity("London");
        user4.getAddress().setStreet("Oxford St");
        user4.getAddress().setNumber(12);
        user4.getAddress().setZipcode("W1D 1BL");
        user4.set__v(0);

        User user5 = new User();
        user5.setId(5);
        user5.setEmail("tom.jackson@example.com");
        user5.setUsername("tomjackson");
        user5.setPassword("password");
        user5.setName(new Name());
        user5.getName().setFirstname("Tom");
        user5.getName().setLastname("Jackson");
        user5.setPhone("345-678-9012");
        user5.setAddress(new Address());
        user5.getAddress().setGeolocation(new Geolocation());
        user5.getAddress().getGeolocation().setMylong(20);
        user5.getAddress().getGeolocation().setLat(10);
        user5.set__v(0);
        return userList;
    }

    public static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setTitle("Smartphone");
        product1.setPrice(new BigDecimal("999.99"));
        product1.setDescription("A powerful smartphone with the latest features.");
        product1.setCategory("Electronics");
        product1.setImage("smartphone.jpg");
        product1.setRating(new Rating());
        product1.getRating().setRate(4.5);
        product1.getRating().setCount(100);

        Product product2 = new Product();
        product2.setId(2);
        product2.setTitle("Laptop");
        product2.setPrice(new BigDecimal("1499.99"));
        product2.setDescription("A high-end laptop with a large display and fast processor.");
        product2.setCategory("Electronics");
        product2.setImage("laptop.jpg");
        product2.setRating(new Rating());
        product2.getRating().setRate(4.8);
        product2.getRating().setCount(50);

        Product product3 = new Product();
        product3.setId(3);
        product3.setTitle("Running Shoes");
        product3.setPrice(new BigDecimal("89.99"));
        product3.setDescription("Comfortable and durable running shoes for any terrain.");
        product3.setCategory("Sports");
        product3.setImage("runningshoes.jpg");
        product3.setRating(new Rating());
        product3.getRating().setRate(4.2);
        product3.getRating().setCount(200);

        Product product4 = new Product();
        product4.setId(4);
        product4.setTitle("Headphones");
        product4.setPrice(new BigDecimal("149.99"));
        product4.setDescription("Noise-cancelling headphones with superior sound quality.");
        product4.setCategory("Electronics");
        product4.setImage("headphones.jpg");
        product4.setRating(new Rating());
        product4.getRating().setRate(4.7);
        product4.getRating().setCount(75);

        Product product5 = new Product();
        product5.setId(5);
        product5.setTitle("Hiking Backpack");
        product5.setPrice(new BigDecimal("129.99"));
        product5.setDescription("A rugged backpack with plenty of room for all your hiking gear.");
        product5.setCategory("Outdoors");
        product5.setImage("backpack.jpg");
        product5.setRating(new Rating());
        product5.getRating().setRate(4.0);
        product5.getRating().setCount(150);

        Product product6 = new Product();
        product6.setId(6);
        product6.setTitle("Bluetooth Speaker");
        product6.setPrice(new BigDecimal("79.99"));
        product6.setDescription("A compact and portable Bluetooth speaker with great sound quality.");
        product6.setCategory("Electronics");
        product6.setImage("speaker.jpg");
        product6.setRating(new Rating());
        product6.getRating().setRate(4.5);
        product6.getRating().setCount(50);

        Product product7 = new Product();
        product7.setId(7);
        product7.setTitle("Digital Camera");
        product7.setPrice(new BigDecimal("499.99"));
        product7.setDescription("A high-end digital camera with advanced features for professional photographers.");
        product7.setCategory("Electronics");
        product7.setImage("camera.jpg");
        product7.setRating(new Rating());
        product7.getRating().setRate(4.9);
        product7.getRating().setCount(25);

        Product product8 = new Product();
        product8.setId(8);
        product8.setTitle("Sneakers");
        product8.setPrice(new BigDecimal("129.99"));
        product8.setDescription("Comfortable and stylish sneakers for everyday wear.");
        product8.setCategory("Fashion");
        product8.setImage("sneakers.jpg");
        product8.setRating(new Rating());
        product8.getRating().setRate(4.2);
        product8.getRating().setCount(100);

        Product product9 = new Product();
        product9.setId(9);
        product9.setTitle("Portable Charger");
        product9.setPrice(new BigDecimal("39.99"));
        product9.setDescription("A compact and lightweight portable charger for charging your devices on the go.");
        product9.setCategory("Electronics");
        product9.setImage("charger.jpg");
        product9.setRating(new Rating());
        product9.getRating().setRate(4.6);
        product9.getRating().setCount(75);

        Product product10 = new Product();
        product10.setId(10);
        product10.setTitle("Water Bottle");
        product10.setPrice(new BigDecimal("19.99"));
        product10.setDescription("A durable and leak-proof water bottle for outdoor activities.");
        product10.setCategory("Outdoors");
        product10.setImage("waterbottle.jpg");
        product10.setRating(new Rating());
        product10.getRating().setRate(4.0);
        product10.getRating().setCount(150);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);

        return productList;
    }
    public static List<Cart> getCaerds(){
        List<Cart> cartList = new ArrayList<>();

        Cart cart1 = new Cart();
        cart1.setId(1);
        cart1.setUserId(1);
        cart1.setDate(LocalDateTime.of(2022, 4, 13, 10, 0));
        List<ProductInfo> productInfos1 = new ArrayList<>();
        productInfos1.add(new ProductInfo(1, 2));
        productInfos1.add(new ProductInfo(2, 1));
        productInfos1.add(new ProductInfo(5, 2));
        productInfos1.add(new ProductInfo(6, 7));
        productInfos1.add(new ProductInfo(7, 2));
        productInfos1.add(new ProductInfo(8, 1));
        cart1.setProductInfos(productInfos1);

        Cart cart2 = new Cart();
        cart2.setId(2);
        cart2.setUserId(2);
        cart2.setDate(LocalDateTime.of(2022, 4, 13, 11, 0));
        List<ProductInfo> productInfos2 = new ArrayList<>();
        productInfos2.add(new ProductInfo(3, 1));
        productInfos2.add(new ProductInfo(4, 3));
        cart2.setProductInfos(productInfos2);

        Cart cart3 = new Cart();
        cart3.setId(3);
        cart3.setUserId(3);
        cart3.setDate(LocalDateTime.of(2022, 4, 13, 12, 0));
        List<ProductInfo> productInfos3 = new ArrayList<>();
        productInfos3.add(new ProductInfo(2, 1));
        productInfos3.add(new ProductInfo(5, 2));
        cart3.setProductInfos(productInfos3);

        Cart cart4 = new Cart();
        cart4.setId(4);
        cart4.setUserId(4);
        cart4.setDate(LocalDateTime.of(2022, 4, 13, 13, 0));
        List<ProductInfo> productInfos4 = new ArrayList<>();
        productInfos4.add(new ProductInfo(4, 2));
        productInfos4.add(new ProductInfo(1, 1));
        productInfos4.add(new ProductInfo(10, 3));
        productInfos4.add(new ProductInfo(6, 1));
        cart4.setProductInfos(productInfos4);

        Cart cart5 = new Cart();
        cart5.setId(5);
        cart5.setUserId(5);
        cart5.setDate(LocalDateTime.of(2022, 4, 13, 14, 0));
        List<ProductInfo> productInfos5 = new ArrayList<>();
        productInfos5.add(new ProductInfo(3, 3));
        productInfos5.add(new ProductInfo(5, 1));
        productInfos5.add(new ProductInfo(7, 3));
        productInfos5.add(new ProductInfo(9, 1));
        cart5.setProductInfos(productInfos5);

        cartList.add(cart1);
        cartList.add(cart2);
        cartList.add(cart3);
        cartList.add(cart4);
        cartList.add(cart5);
        return cartList;
    }

}
