package com.avijit.inventorymanagementbackend.Model;


import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    private Long id;
    private String createdAt;
    private String updatedAt;
}
