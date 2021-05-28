package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// FilmActor
@Repository

public interface FilmActorRepository extends JpaRepository<FilmActor, Integer> {

}