package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Customer
@Repository

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}