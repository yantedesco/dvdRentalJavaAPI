package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Staff;
import com.residencia.dvdrental.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    public StaffRepository staffRepository;

    public Staff findById(Integer id) {
        return staffRepository.findById(id).get();
    }

    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }
}
