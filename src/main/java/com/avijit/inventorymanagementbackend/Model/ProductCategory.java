package com.avijit.inventorymanagementbackend.Model;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductCategory {
    @NotNull
    private String CategoryName;
}
