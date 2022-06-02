package com.example.project.rest.api.repository;

import java.util.ArrayList;

import com.example.project.rest.api.model.Alternativa;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryAlternativa extends CrudRepository <Alternativa, Integer>{
  
  ArrayList<Alternativa> findById(int letra);
  
}