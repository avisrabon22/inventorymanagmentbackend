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
    @OneToOne()
    @JoinColumn(name = "user_id",nullable = false)
    private Users user;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Products> products;
}
