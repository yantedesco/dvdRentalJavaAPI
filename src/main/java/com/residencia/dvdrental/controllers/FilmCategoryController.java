package com.residencia.dvdrental.controllers;


import com.residencia.dvdrental.entities.FilmCategory;
import com.residencia.dvdrental.services.FilmCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FilmCategory")
public class FilmCategoryController {
    @Autowired
    private FilmCategoryService filmCategoryService;

    @GetMapping("/{id}")
    public ResponseEntity<FilmCategory> findById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(filmCategoryService.findById(id), headers, HttpStatus.OK);

    }

}
