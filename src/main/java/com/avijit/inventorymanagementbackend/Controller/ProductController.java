package com.avijit.inventorymanagementbackend.Controller;


import com.avijit.inventorymanagementbackend.DTO.ProductRequestDTO;
import com.avijit.inventorymanagementbackend.DTO.ProductResponseDto;
import com.avijit.inventorymanagementbackend.Service.ProductService;
import com.avijit.inventorymanagementbackend.Service.ProductServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductServiceInterface productServiceInterface;

    public ProductController(ProductService productService) {
        this.productServiceInterface = productService;
    }

//    get all products
    @GetMapping("/get_all_products")
    public ResponseEntity<List<ProductResponseDto>>getAllProducts() {
        return ResponseEntity.ok(productServiceInterface.getAllProducts());
    }

//    add product
    @PostMapping("/add_product")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        productServiceInterface.addProduct(productRequestDTO);

        return ResponseEntity.ok("Product added successfully");
}


}
