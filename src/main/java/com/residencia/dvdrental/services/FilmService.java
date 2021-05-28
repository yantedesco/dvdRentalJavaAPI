package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Film;
import com.residencia.dvdrental.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    public FilmRepository filmRepository;

    public Film findById(Integer id) {
        return filmRepository.findById(id).get();
    }

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Film save(Film film) {
        return filmRepository.save(film);
    }
}
