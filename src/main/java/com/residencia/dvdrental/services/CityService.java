package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.City;
import com.residencia.dvdrental.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    public CityRepository cityRepository;

    public City findById(Integer id) {
        return cityRepository.findById(id).get();
    }

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public City save(City city) {
        return cityRepository.save(city);
    }
}
