package com.avijit.inventorymanagementbackend.Service;


import com.avijit.inventorymanagementbackend.DTO.CategoryRequestDto;
import com.avijit.inventorymanagementbackend.DTO.CategoryResponseDto;
import com.avijit.inventorymanagementbackend.Model.ProductCategory;
import com.avijit.inventorymanagementbackend.Repository.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements CategoryServiceInterface{
    private final CategoryRepo categoryRepository;

    public CategoryService(CategoryRepo categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryResponseDto> getAllCategories() {
        List<CategoryResponseDto> categoryResponseDtos = new ArrayList<>();
        categoryRepository.findAll().forEach(category -> {
            CategoryResponseDto categoryResponseDto = new CategoryResponseDto();
            categoryResponseDto.setCategoryName(category.getCategoryName());
            categoryResponseDto.setId(category.getId());
            categoryResponseDtos.add(categoryResponseDto);
        });
        return categoryResponseDtos;
    }


    @Override
    public void addCategory(CategoryRequestDto categoryRequestDto) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName(categoryRequestDto.getCategoryName());
        categoryRepository.save(productCategory);
    }


}
