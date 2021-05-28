package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Rental;
import com.residencia.dvdrental.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    @Autowired
    public RentalRepository rentalRepository;

    public Rental findById(Integer id) {
        return rentalRepository.findById(id).get();
    }

    public List<Rental> findAll() {
        return rentalRepository.findAll();
    }

    public Rental save(Rental rental) {
        return rentalRepository.save(rental);
    }
}
