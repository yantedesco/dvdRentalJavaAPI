package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Actor;
import com.residencia.dvdrental.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    public ActorRepository actorRepository;

    public Actor findById(Integer id) {
        return actorRepository.findById(id).get();
    }

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }
}
