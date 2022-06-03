package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Turma;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryTurma extends CrudRepository <Turma, Integer>{
    Turma findById(int id);

    @Query(value = "SELECT * FROM turmas where mat_professor = :matricula", nativeQuery = true)
    List<Turma> selectAllTurmas(int matricula);

}
