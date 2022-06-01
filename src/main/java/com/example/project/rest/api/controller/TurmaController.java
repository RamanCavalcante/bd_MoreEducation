package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Turma;
import com.example.project.rest.api.repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/turma")
public class TurmaController {
    
    @Autowired
    private RepositoryTurma repository;

    @GetMapping(path = "/all")
    public Iterable<Turma> listaTurma() {
        return repository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Turma consultar(@PathVariable("id") int id){
        return repository.findById(id);
    }

    @PostMapping(path = "/cadastrar")
    public Turma cadastrar(@RequestBody Turma saveTurma){
        return repository.save(saveTurma);
    }
} 
