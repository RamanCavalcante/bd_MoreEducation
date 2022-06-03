package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Composicao;
import com.example.project.rest.api.repository.RepositoryComposicao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/composicao")
@CrossOrigin
public class ComposicaoController {

    @Autowired
    private RepositoryComposicao repository;

    @GetMapping(path = "/all")
    public Iterable<Composicao> listaAluno() {
        return repository.findAll();
    }

    @PostMapping(path = "/cadastrar")
    
    public Composicao cadastrar(@RequestBody Composicao composicao){
        return repository.save(composicao);
    }
    
}
