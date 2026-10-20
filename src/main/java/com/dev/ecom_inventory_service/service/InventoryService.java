package com.dev.ecom_inventory_service.service;

import com.dev.ecom_inventory_service.model.Inventory;
import com.dev.ecom_inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

    public Inventory checkStock(Long productId) {
        Optional<Inventory> inv= inventoryRepository.findById(productId);
        return inv.get();
    }

    public String addProduct(Inventory inventory) {
        inventoryRepository.save(inventory);
        return "Product added";
    }

    public String updateProduct(Inventory inventory) {
        inventoryRepository.save(inventory);
        return "Product Updated";
    }

    public String deleteProduct(Long productId) {
        inventoryRepository.deleteById(productId);
        return "Product Deleted";
    }

}
