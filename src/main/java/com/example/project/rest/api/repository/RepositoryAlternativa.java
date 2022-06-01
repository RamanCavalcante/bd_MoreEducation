package com.example.project.rest.api.repository;

import com.example.project.rest.api.model.Alternativa;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryAlternativa extends CrudRepository <Alternativa, Integer>{
  Alternativa findById(int letra);
}