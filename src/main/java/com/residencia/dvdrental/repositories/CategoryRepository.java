package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Category
@Repository

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
