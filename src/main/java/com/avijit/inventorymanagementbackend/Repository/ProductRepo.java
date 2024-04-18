package com.avijit.inventorymanagementbackend.Repository;


import com.avijit.inventorymanagementbackend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long> {

}
