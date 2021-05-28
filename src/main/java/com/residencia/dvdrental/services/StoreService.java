package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Store;
import com.residencia.dvdrental.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    public StoreRepository storeRepository;

    public Store findById(Integer id) {
        return storeRepository.findById(id).get();
    }

    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    public Store save(Store store) {
        return storeRepository.save(store);
    }
}
