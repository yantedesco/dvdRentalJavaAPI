package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Address;
import com.residencia.dvdrental.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressRepository addressRepository;

    public Address findById(Integer id) {
        return addressRepository.findById(id).get();
    }

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address save(Address address) {
        return addressRepository.save(address);
    }
}
