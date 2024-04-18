package com.avijit.inventorymanagementbackend.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class ProductCategory extends BaseModel{
    private String categoryName;
}


