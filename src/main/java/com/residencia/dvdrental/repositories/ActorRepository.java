package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Actor
@Repository

public interface ActorRepository extends JpaRepository<Actor, Integer> {


}
