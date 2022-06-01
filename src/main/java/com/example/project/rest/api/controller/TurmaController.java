package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Turma;
import com.example.project.rest.api.repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {
    
    @Autowired
    private RepositoryTurma repository;

    @GetMapping(path = "api/turma/{id}")
    public ResponseEntity consultar(@PathVariable("id") int id){
        return repository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/turma/salvar")
    public Turma salvar(@RequestBody Turma saveTurma){
        return repository.save(saveTurma);
    }
} 
