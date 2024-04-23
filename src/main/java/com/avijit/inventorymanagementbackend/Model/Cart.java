package com.avijit.inventorymanagementbackend.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
@Entity
public class Cart extends  BaseModel{
    @Column(nullable = false)
    private int totalPrice;
    @Column(nullable = false)
    @OneToOne
    private Users user;
    @OneToMany
    @Column(nullable = false)
    private List<Products> products;
}
