package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.repository.RepositoryAluno;

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
@RequestMapping(value = "/api/aluno")
@CrossOrigin
public class AlunoController {

    @Autowired
    private RepositoryAluno repository;

    @GetMapping(path = "/all")
    public Iterable<Aluno> listaAluno() {
        return repository.findAll();
    }


    @GetMapping(path = "/{matricula}")
    public Aluno acharAluno(@PathVariable("matricula") int matricula){
        return repository.findById(matricula);
    }

    @PostMapping(path = "/cadastrar")
    public Aluno cadastrar(@RequestBody Aluno usuario){
        return repository.save(usuario);
    }

    @GetMapping(path = "/login")
    public void login(@RequestBody Aluno usuario){
        Aluno usuarioAluno = repository.findById(usuario.getMatricula());

        if(usuarioAluno.getSenha().equals(usuario.getSenha())){
            System.out.println("Sucesso!!");
        }else{
            System.out.println("Acesso negado!!");
        }
    }


    @DeleteMapping(path = "/delete/{idaluno}")
    public void deleteAluno(@PathVariable("idaluno") int idaluno){
         repository.deleteById(idaluno);
    }
}
