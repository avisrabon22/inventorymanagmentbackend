package com.avijit.inventorymanagementbackend.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Users {
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private UserType role;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String address;
    private String image;
}
