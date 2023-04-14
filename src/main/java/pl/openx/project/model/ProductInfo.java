package pl.openx.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductInfo {
    private int productId;
    private int quantity;

}