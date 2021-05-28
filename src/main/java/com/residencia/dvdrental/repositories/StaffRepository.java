package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Staff
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}

