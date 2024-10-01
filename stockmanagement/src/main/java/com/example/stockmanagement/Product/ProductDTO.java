package com.example.stockmanagement.Product;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ProductDTO {

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private double price;

    @JsonProperty("quantity_in_stock")
    private int quantityInStock;

    @JsonProperty("created_at")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm")
    private LocalDateTime updatedAt;

}
