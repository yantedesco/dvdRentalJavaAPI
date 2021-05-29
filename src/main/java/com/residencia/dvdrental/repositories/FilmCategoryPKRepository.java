package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.entities.FilmCategoryPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// FilmCategoryPK
@Repository
public interface FilmCategoryPKRepository extends JpaRepository<FilmCategory, FilmCategoryPK> {

}
