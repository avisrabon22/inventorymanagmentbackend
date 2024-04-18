package com.avijit.inventorymanagementbackend.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private String productName;
    private int price;
    private String description;
    private String image;
    private String barCode;
    private int quantity;
    private String productCategory;
}
