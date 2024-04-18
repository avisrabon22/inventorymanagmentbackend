package com.avijit.inventorymanagementbackend.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Orders extends BaseModel{
    @NotNull
    @Column(unique = true)
    private String orderNumber;
    @NotNull
    private String orderDate;
    @NotNull
    private double totalAmount;
    @NotNull
    @OneToMany
    private List<Products> products;
    @NotNull
    @ManyToOne
    private Users user;
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus orderStatus;
}
