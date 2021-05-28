package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.FilmActor;
import com.residencia.dvdrental.repositories.FilmActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmActorService {
    @Autowired
    public FilmActorRepository filmActorRepository;

    public FilmActor findById(Integer id) {
        return filmActorRepository.findById(id).get();
    }

    public List<FilmActor> findAll() {
        return filmActorRepository.findAll();
    }

    public FilmActor save(FilmActor filmActor) {
        return filmActorRepository.save(filmActor);
    }
}
