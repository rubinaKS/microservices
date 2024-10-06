package com.garage.inventory.repository;

import com.garage.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
