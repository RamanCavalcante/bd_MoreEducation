package com.example.project.rest.api.controller;

import java.util.ArrayList;

import com.example.project.rest.api.model.Alternativa;
import com.example.project.rest.api.repository.RepositoryAlternativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/alternativa")
@CrossOrigin
public class AlternativaController {
    
    @Autowired
    private RepositoryAlternativa repository;

    @GetMapping(path = "/all")
    public Iterable<Alternativa> listaAlternativa() {
        return repository.findAll();
    }

    @GetMapping(path = "/achar/{cod_questao}")
    public ArrayList<Alternativa> acharQuestoes(@PathVariable(value = "cod_questao") int cod_questao) {
        ArrayList<Alternativa> alternativas_da_questao = new ArrayList<>();
        Iterable<Alternativa> questoesList;
        questoesList = repository.findAll();

        for(Alternativa a: questoesList){

            if(a.getCod_questao_a() == cod_questao){
                System.out.println(a.getCod_questao_a());
                alternativas_da_questao.add(a);
            }
        }
        //repository.findById(cod_questao);
        return alternativas_da_questao;
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
