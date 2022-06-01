package com.example.project.rest.api.controller;

import java.util.ArrayList;

import com.example.project.rest.api.model.Professor;
import com.example.project.rest.api.model.Turma;
import com.example.project.rest.api.repository.RepositoryProfessor;
// import com.example.project.rest.api.repository.RepositoryTurma;
import com.example.project.rest.api.repository.RepositoryTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/professor")
@CrossOrigin
public class ProfessorController {
    
    @Autowired
    private RepositoryProfessor repository;
    private RepositoryTurma repositoryTurma; 


    @GetMapping(path = "/all")
    public Iterable<Professor> listaQuestao() {
        return repository.findAll();
    }


    
    @GetMapping(path = "/turmasMinistradas/{matricula}")
    public ArrayList<Turma> findTurmasMinistradas(@PathVariable(value = "matricula") int matricula){
        Iterable<Turma> turmasList;
        ArrayList<Turma> turmasDoProfessor = new ArrayList<>();
        turmasList = repositoryTurma.findAll();

        for(Turma t: turmasList){
            
            if(t.getMat_professor() == matricula){
                System.out.println(t.getMat_professor());
                turmasDoProfessor.add(t);
            }
        }
        

        return turmasDoProfessor;
    }

    @GetMapping(path = "/{matricula}")
    public Professor acharProfessor(@PathVariable(value = "matricula") int matricula) {
        return repository.findById(matricula);
    }

    @PostMapping(path = "/cadastrar")
    public Professor cadastrar(@RequestBody Professor usuarioProfessor){
        return repository.save(usuarioProfessor);
    }

    @GetMapping(path = "/login")
    public void login(@RequestBody Professor usuarioProfessor) {
        
    }

    @PostMapping(path = "/delete/{matricula}")
    public void deletar(@PathVariable(value = "matricula") int matricula) {
        repository.deleteById(matricula);
    }

}

