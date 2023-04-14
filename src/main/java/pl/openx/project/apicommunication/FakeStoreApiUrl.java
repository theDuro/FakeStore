package pl.openx.project.apicommunication;

public enum FakeStoreApiUrl {
    USERS("https://fakestoreapi.com/users"),
    CARTS("https://fakestoreapi.com/carts"),
    PRODUCTS("https://fakestoreapi.com/products");
    private final String url;
    FakeStoreApiUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
}