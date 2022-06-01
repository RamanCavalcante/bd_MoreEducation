package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Professor;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryProfessor extends CrudRepository <Professor, Integer>{
  Professor findById(int matricula);
}
