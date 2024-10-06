package com.garage.inventory.controller;

import com.garage.inventory.model.Inventory;
import com.garage.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<Inventory> getAllProducts() {
        return inventoryService.getAllInventory();
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable String id) {
        return inventoryService.getInventoryByItemCode(id);
    }

    @PostMapping
    public Inventory addInventory(@RequestBody Inventory product) {
        return inventoryService.addInventory(product);
    }

    @PutMapping("/{productId}")
    public Inventory updateInventory(@PathVariable String productId, @RequestParam int quantity) {
        return inventoryService.updateInventory(productId, quantity);
    }
}
