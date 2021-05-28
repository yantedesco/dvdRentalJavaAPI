package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Inventory;
import com.residencia.dvdrental.repositories.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    public com.residencia.dvdrental.repositories.InventoryRepository InventoryRepository;

    public Inventory findById(Integer id) {
        return InventoryRepository.findById(id).get();
    }

    public List<Inventory> findAll() {
        return InventoryRepository.findAll();
    }

    public Inventory save(Inventory Inventory) {
        return InventoryRepository.save(Inventory);
    }
}
