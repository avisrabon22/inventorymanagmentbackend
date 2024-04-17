package com.avijit.inventorymanagementbackend.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductItems {
    @Column(nullable = false)
    private double CurrentPrice;
    @Column(nullable = false)
    private int CurrentQuantity;
    @Column(nullable = false)
    @OneToOne
    private Products product;
}
