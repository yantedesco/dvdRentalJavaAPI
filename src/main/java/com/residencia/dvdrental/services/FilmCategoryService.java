package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.repositories.FilmCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmCategoryService {
    @Autowired
    public FilmCategoryRepository filmCategoryRepository;

    public FilmCategory findById(Integer id) {
        return filmCategoryRepository.findById(id).get();
    }

    public List<FilmCategory> findAll() {
        return filmCategoryRepository.findAll();
    }

    public FilmCategory save(FilmCategory filmCategory) {
        return filmCategoryRepository.save(filmCategory);
    }
}
