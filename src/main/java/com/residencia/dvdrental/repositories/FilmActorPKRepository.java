package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.FilmActorPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// FilmActorPK
@Repository

public interface FilmActorPKRepository extends JpaRepository<FilmActorPK, Integer> {

}
