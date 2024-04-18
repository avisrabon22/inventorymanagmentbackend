package com.avijit.inventorymanagementbackend.Controller;


import com.avijit.inventorymanagementbackend.DTO.ProductRequestDTO;
import com.avijit.inventorymanagementbackend.DTO.ProductResponseDto;
import com.avijit.inventorymanagementbackend.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    get all products
    @GetMapping("/get_all_products")
    public ResponseEntity<List<ProductResponseDto>>getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

//    add product
    @PostMapping("/add_product")
    public ResponseEntity<String> addProduct(@RequestBody ProductRequestDTO productRequestDTO) {
        productService.addProduct(productRequestDTO);

        return ResponseEntity.ok("Product added successfully");
}


}
