package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Professor;
import com.example.project.rest.api.repository.RepositoryProfessor;
import com.example.project.rest.api.repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    
    @Autowired
    private RepositoryProfessor repository;
    private RepositoryTurma repositoryTurma; 


    @GetMapping(path = "api/professor/{matricula}")
    public ResponseEntity consultar(@PathVariable("matricula") int matricula){
        System.out.println(repository);

        return repository.findById(matricula)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
        

    }


    @PostMapping(path = "api/professor/salvar")
    public Professor salvar(@RequestBody Professor usuarioProfessor){
        return repository.save(usuarioProfessor);
    }

    @GetMapping(path = "api/professor/turmasMinistradas")
    public void consultarTurmas(Professor professor){
    }
}

