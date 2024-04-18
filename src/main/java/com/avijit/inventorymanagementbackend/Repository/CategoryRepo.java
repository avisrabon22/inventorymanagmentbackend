package com.avijit.inventorymanagementbackend.Repository;

import com.avijit.inventorymanagementbackend.Model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<ProductCategory,Long> {
}
