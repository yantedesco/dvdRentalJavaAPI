package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// City
@Repository

public interface CityRepository extends JpaRepository<City, Integer> {

}
