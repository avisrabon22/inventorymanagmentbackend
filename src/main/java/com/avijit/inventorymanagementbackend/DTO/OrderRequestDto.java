package com.avijit.inventorymanagementbackend.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDto {
    private String orderNumber;
    private String orderDate;
    private int totalAmount;
    private String products;
    private String user;
    private String orderStatus;
}
