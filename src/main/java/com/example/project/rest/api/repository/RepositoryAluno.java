package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Aluno;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryAluno extends CrudRepository <Aluno, Integer>{
    Aluno findById(int matricula);
}
