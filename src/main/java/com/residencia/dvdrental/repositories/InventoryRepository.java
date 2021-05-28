package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Inventory
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}