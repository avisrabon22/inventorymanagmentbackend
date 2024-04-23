package com.avijit.inventorymanagementbackend.Service;


import com.avijit.inventorymanagementbackend.DTO.OrderResponseDto;
import com.avijit.inventorymanagementbackend.Model.Orders;
import com.avijit.inventorymanagementbackend.Repository.OrderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderServiceInterface{
    private final OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<OrderResponseDto> getAllOrders() {
        List<Orders> orders = orderRepo.findAll();
        OrderResponseDto orderResponseDto = new OrderResponseDto();
//        orderResponseDto.setOrderNumber(orders.get);
        return List.of();
    }

    @Override
    public List<OrderResponseDto> getOrderByUser(String userId) {
        return List.of();
    }
}
