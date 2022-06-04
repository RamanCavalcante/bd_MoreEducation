package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Turma;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryTurma extends CrudRepository <Turma, Integer>{
    Turma findById(int id);

    @Query(value = "SELECT nome FROM alunos", nativeQuery = true)
    List selectAllTurmas(int matricula);


    @Query(value = "SELECT turmas.nome, COUNT(alunos.nome) FROM alunos, turmas GROUP BY turmas.id",
    nativeQuery = true)
    List listarQuantidadeAlunos();

}
