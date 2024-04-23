package com.avijit.inventorymanagementbackend.Controller;


import com.avijit.inventorymanagementbackend.DTO.OrderRequestDto;
import com.avijit.inventorymanagementbackend.DTO.OrderResponseDto;
import com.avijit.inventorymanagementbackend.Service.OrderServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderServiceInterface orderServiceInterface;

    public OrderController(OrderServiceInterface orderServiceInterface) {
        this.orderServiceInterface = orderServiceInterface;
    }

    @GetMapping("/get_all_orders")
    public ResponseEntity<List<OrderResponseDto>> getAllOrders(){
        return ResponseEntity.ok(orderServiceInterface.getAllOrders());
    }

    @PostMapping("/add_order")
    public void addOrder(@RequestBody  OrderRequestDto orderRequestDto){


    }

}
