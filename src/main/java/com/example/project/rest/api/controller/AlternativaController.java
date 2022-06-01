package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Alternativa;
import com.example.project.rest.api.repository.RepositoryAlternativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/alternativa")
public class AlternativaController {
    
    @Autowired
    private RepositoryAlternativa repository;

    @GetMapping(path = "/all")
    public Iterable<Alternativa> listaAlternativa() {
        return repository.findAll();
    }

    @GetMapping(path = "/{letra}")
    public Alternativa consultar(@PathVariable("letra") int letra){
      return repository.findById(letra);
    }

    @PostMapping(path = "/cadastrar", consumes = {"application/json"}) 
    public Alternativa cadastrar(@RequestBody Alternativa alter){
        return repository.save(alter);
    }
} 
