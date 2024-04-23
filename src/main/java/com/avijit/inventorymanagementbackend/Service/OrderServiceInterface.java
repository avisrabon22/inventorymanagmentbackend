package com.avijit.inventorymanagementbackend.Service;

import com.avijit.inventorymanagementbackend.DTO.OrderResponseDto;

import java.util.List;

public interface OrderServiceInterface {

    List<OrderResponseDto> getAllOrders();

    List<OrderResponseDto> getOrderByUser(String userId);
}
