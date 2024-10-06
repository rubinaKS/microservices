package com.garage.inventory.service;

import com.garage.inventory.model.Inventory;
import com.garage.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByItemCode(String itemcode) {
        return inventoryRepository.findById(itemcode).orElse(null);
    }

    public Inventory addInventory(Inventory product) {
        return inventoryRepository.save(product);
    }

    public Inventory updateInventory(String itemcode, int quantity) {
        Inventory inventory = inventoryRepository.findById(itemcode).orElseThrow(() -> new RuntimeException("Product not found"));
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }

    public boolean checkIfInventoryLow(String itemcode) {
        Inventory inventory = inventoryRepository.findById(itemcode).orElseThrow(() -> new RuntimeException("Product not found"));
        return inventory.getQuantity() < inventory.getThreshold();
    }
}