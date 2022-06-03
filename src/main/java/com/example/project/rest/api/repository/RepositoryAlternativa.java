package com.example.project.rest.api.repository;

import java.util.ArrayList;

import com.example.project.rest.api.model.Alternativa;

import antlr.collections.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryAlternativa extends CrudRepository <Alternativa, Integer>{
  
  ArrayList<Alternativa> findById(int letra);
  
  @Query(value = "SELECT questoes.enunciado, alternativas.resposta FROM alternativas INNER JOIN questoes ON questoes.id = alternativas.cod_questao_a", nativeQuery = true)
  List alternativasQuestoes();

}