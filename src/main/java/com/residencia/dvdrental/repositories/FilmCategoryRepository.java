package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.FilmCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// FilmCategory
@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Integer> {

}