package com.residencia.dvdrental.controllers;

import com.residencia.dvdrental.entities.FilmActor;
import com.residencia.dvdrental.services.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/FilmActor")
public class FilmActorController {
    @Autowired
    private FilmActorService filmActorService;


    @GetMapping("/{id}")
    public ResponseEntity<FilmActor> findById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(filmActorService.findById(id),headers, HttpStatus.OK);
    }
}

