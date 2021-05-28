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
        Address newAddress = addressRepository.save(address);
        if (newAddress.getAddressId() != null) {
            return newAddress;
        } else {
            return null;
        }
    }

    //Caso não tenha o @Id
    public Address update(Address address, Integer id) {
        address.setAddressId(id);
        return addressRepository.save(address);
    }

    //Caso a instância recebida de Address tenha nela o @Id da entidade
    public Address update(Address address) {
        return addressRepository.save(address);
    }
}
