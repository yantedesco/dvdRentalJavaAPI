package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Film
@Repository
public interface FilmRepository extends JpaRepository<Film, Integer> {

}
