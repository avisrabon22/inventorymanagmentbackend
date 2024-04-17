package com.avijit.inventorymanagementbackend.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedBy
    @Temporal(TemporalType.TIMESTAMP)
    private String createdAt;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private String updatedAt;
}
