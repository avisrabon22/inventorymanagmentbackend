package com.avijit.inventorymanagementbackend.DTO;


import com.avijit.inventorymanagementbackend.Model.ProductCategory;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private String productName;
    private int price;
    private String description;
    private String image;
    private String barCode;
    private int quantity;
    private String productCategory;
}
