package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Payment;
import com.residencia.dvdrental.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    public PaymentRepository paymentRepository;

    public Payment findById(Integer id) {
        return paymentRepository.findById(id).get();
    }

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
