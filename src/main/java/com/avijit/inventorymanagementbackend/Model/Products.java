package com.avijit.inventorymanagementbackend.Model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Products extends BaseModel{
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private int price;
    private String description;
    private String image;
    @Column(unique = true)
    private String barCode;
    @Column(nullable = false)
    private int quantity;
    @OneToOne
    private ProductCategory productCategory;
}
