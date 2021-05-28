package com.residencia.dvdrental.services;

import com.residencia.dvdrental.entities.Language;
import com.residencia.dvdrental.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    @Autowired
    public LanguageRepository languageRepository;

    public Language findById(Integer id) {
        return languageRepository.findById(id).get();
    }

    public List<Language> findAll() {
        return languageRepository.findAll();
    }

    public Language save(Language language) {
        return languageRepository.save(language);
    }
}
