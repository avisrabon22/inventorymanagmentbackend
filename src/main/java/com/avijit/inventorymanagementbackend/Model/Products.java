package com.avijit.inventorymanagementbackend.Model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Products {
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private double price;
    private String description;
    private String image;
    @Column(nullable = false, unique = true)
    private String barCode;
    @Column(nullable = false)
    private int quantity;
    private ProductCategory productCategory;
}
