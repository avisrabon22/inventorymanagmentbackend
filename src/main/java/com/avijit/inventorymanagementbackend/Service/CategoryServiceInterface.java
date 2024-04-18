package com.avijit.inventorymanagementbackend.Service;

import com.avijit.inventorymanagementbackend.DTO.CategoryRequestDto;
import com.avijit.inventorymanagementbackend.DTO.CategoryResponseDto;
import java.util.List;

public interface CategoryServiceInterface {
    public List<CategoryResponseDto> getAllCategories();

    public void addCategory(CategoryRequestDto categoryRequestDto);

}
