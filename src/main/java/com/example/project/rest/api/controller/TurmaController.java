package com.example.project.rest.api.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.model.Turma;
import com.example.project.rest.api.repository.RepositoryAluno;
import com.example.project.rest.api.repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/turma")
@CrossOrigin
public class TurmaController {
    
    @Autowired
    private RepositoryTurma repository;
    
    @Autowired
    private RepositoryAluno repositoryAluno;

    @GetMapping(path = "/all")
    public Iterable<Turma> listaTurma() {
        return repository.findAll();
        
    }

    @GetMapping(path = "/{id}")
    public Turma consultar(@PathVariable("id") int id){
        return repository.findById(id);
    }

    // Forma de retornar os alunos de uma turma
    @GetMapping(path = "/alunosDaTurma/{id}")
    public List<Aluno> consultarAlunos(@PathVariable("id") int idTurma){
        
        Turma turma = repository.findById(idTurma);
        return turma.getAlunos();

    }

    @PostMapping(path = "/cadastrar")
    public Turma cadastrar(@RequestBody Turma saveTurma){
        return repository.save(saveTurma);
    }


    @GetMapping(path = "/consultaTest/{matricula}")
    public List<Turma> consutaTest(@PathVariable("matricula") int matricula){
        return repository.selectAllTurmas(matricula);
    }

} 
