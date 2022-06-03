package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Questao;
import com.example.project.rest.api.repository.RepositoryQuestao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/questao")
@CrossOrigin
public class QuestaoController {
    
    @Autowired
    private RepositoryQuestao repository;

    @GetMapping(path = "/all")
    public Iterable<Questao> listaQuestao() {
        return repository.findAll();
    }

    @GetMapping(path = "/{cod_questao}")
    public Questao consultar(@PathVariable("cod_questao") int cod_questao){
        return repository.findById(cod_questao);
    }

    @PostMapping(path = "/cadastrar")
    public Questao cadastrar(@RequestBody Questao questao){
        return repository.save(questao);
    }

    @DeleteMapping(path = "/delete/all")
    public void deletar() {
        repository.deleteAll();
    }
} 
