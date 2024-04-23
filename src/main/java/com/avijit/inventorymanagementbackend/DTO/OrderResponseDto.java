package com.avijit.inventorymanagementbackend.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderResponseDto {
    private String orderNumber;
    private String orderDate;
    private int totalAmount;
    private List<String> products;
    private String user;
    private String orderStatus;
}
