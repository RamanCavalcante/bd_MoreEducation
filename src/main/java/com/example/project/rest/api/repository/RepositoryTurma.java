package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Turma;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryTurma extends CrudRepository <Turma, Integer>{
    Turma findById(int id);
}
