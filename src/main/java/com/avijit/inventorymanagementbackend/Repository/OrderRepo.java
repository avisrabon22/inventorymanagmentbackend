package com.avijit.inventorymanagementbackend.Repository;


import com.avijit.inventorymanagementbackend.Model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo  extends JpaRepository<Orders,Long> {

}
