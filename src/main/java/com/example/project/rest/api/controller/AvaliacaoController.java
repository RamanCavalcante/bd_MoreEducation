package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.model.Avaliacao;
import com.example.project.rest.api.repository.RepositoryAvaliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/avaliacao")
@CrossOrigin
public class AvaliacaoController {

    @Autowired
    private RepositoryAvaliacao repository;

    @GetMapping(path = "/all")
    public Iterable<Avaliacao> listaAluno() {
        return repository.findAll();
    }

    @PostMapping(path = "/cadastrar")
    public Avaliacao cadastrar(@RequestBody Avaliacao avaliacao){
        return repository.save(avaliacao);
    }
    
}
