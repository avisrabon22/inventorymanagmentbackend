package com.avijit.inventorymanagementbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InventorymanagementbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorymanagementbackendApplication.class, args);
	}

}
