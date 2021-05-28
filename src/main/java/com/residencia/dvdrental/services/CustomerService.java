package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Customer;
import com.residencia.dvdrental.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    public Customer findById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
