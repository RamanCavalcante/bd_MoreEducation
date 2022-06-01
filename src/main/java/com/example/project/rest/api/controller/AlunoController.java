package com.example.project.rest.api.controller;

import java.util.Optional;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.repository.RepositoryAluno;

import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {
    


    @Autowired
    private RepositoryAluno repository;

    @GetMapping(path = "/api/aluno/{matricula}")
    public ResponseEntity consultar(@PathVariable("matricula") int matricula){
        return repository.findById(matricula)
            .map(record -> ResponseEntity.ok().body(record))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "api/aluno/salvar")
    public Aluno salvar(@RequestBody Aluno usuario){
        return repository.save(usuario);
    }

    @GetMapping(path = "api/aluno/login/{matricula}/")
    public void login(@PathVariable("matricula") int matricula, @PathVariable("senha") int senha){
         
    }

}
