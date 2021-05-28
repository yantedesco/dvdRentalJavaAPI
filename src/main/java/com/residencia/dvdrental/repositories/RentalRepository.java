package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Rental
@Repository
public interface RentalRepository extends JpaRepository<Rental, Integer> {

}

