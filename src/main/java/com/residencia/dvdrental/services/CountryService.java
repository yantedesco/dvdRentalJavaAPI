package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Country;
import com.residencia.dvdrental.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    public CountryRepository countryRepository;

    public Country findById(Integer id) {
        return countryRepository.findById(id).get();
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }
}
