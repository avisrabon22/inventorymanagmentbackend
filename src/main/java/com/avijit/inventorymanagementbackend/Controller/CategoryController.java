package com.avijit.inventorymanagementbackend.Controller;


import com.avijit.inventorymanagementbackend.DTO.CategoryRequestDto;
import com.avijit.inventorymanagementbackend.DTO.CategoryResponseDto;
import com.avijit.inventorymanagementbackend.Service.CategoryService;
import com.avijit.inventorymanagementbackend.Service.CategoryServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryServiceInterface categoryServiceInterface;

    public CategoryController(CategoryService categoryService) {
        this.categoryServiceInterface = categoryService;
    }

//    get all categories
    @RequestMapping("/get_all_categories")
    public ResponseEntity<List<CategoryResponseDto>> getAllCategories() {
        return ResponseEntity.ok(categoryServiceInterface.getAllCategories());
    }

//    add category
    @PostMapping("/add_category")
    public ResponseEntity<String> addCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
           categoryServiceInterface.addCategory(categoryRequestDto);

        return ResponseEntity.ok("Category added successfully");
    }

}
