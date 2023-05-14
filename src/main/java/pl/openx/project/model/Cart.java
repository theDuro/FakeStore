package pl.openx.project.model;

import com.google.gson.annotations.SerializedName;
import java.time.LocalDateTime;
import java.util.List;


public class Cart {
    private int id;
    private int userId;
    private LocalDateTime date;

    @SerializedName("products")
    private List<ProductInfo> productInfos;
    private int __v;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    public void setProductInfos(List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }
}
