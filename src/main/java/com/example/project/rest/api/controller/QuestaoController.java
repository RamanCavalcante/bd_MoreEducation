package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Questao;
import com.example.project.rest.api.repository.RepositoryQuestao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution;

@RestController
public class QuestaoController {
    
    @Autowired
    private RepositoryQuestao repository;


    @GetMapping(path = "api/questao/{cod_questao}")
    public ResponseEntity consultar(@PathVariable("cod_questao") int cod_questao){
        return repository.findById(cod_questao)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());   
    }

    @PostMapping(path = "api/questao/salvar")
    public Questao salvar(@RequestBody Questao questao){
    
        return repository.save(questao);
    }
} 
