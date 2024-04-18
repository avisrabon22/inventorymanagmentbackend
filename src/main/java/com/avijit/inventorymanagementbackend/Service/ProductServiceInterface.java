package com.avijit.inventorymanagementbackend.Service;

import com.avijit.inventorymanagementbackend.DTO.ProductRequestDTO;
import com.avijit.inventorymanagementbackend.DTO.ProductResponseDto;

import java.util.List;

public interface ProductServiceInterface {
    public List<ProductResponseDto> getAllProducts();
    public void addProduct(ProductRequestDTO productRequestDTO);
}
