package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Country
@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
