package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Category;
import com.residencia.dvdrental.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepository categoryRepository;

    public Category findById(Integer id) {
        return categoryRepository.findById(id).get();
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
