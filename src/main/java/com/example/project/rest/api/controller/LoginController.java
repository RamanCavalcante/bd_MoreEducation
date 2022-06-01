package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.model.Professor;
import com.example.project.rest.api.repository.RepositoryAluno;
import com.example.project.rest.api.repository.RepositoryProfessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Usuario {
  int matricula;
  String senha;

  Usuario(int matricula, String senha){
    this.matricula = matricula;
    this.senha = senha;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class LoginController {

  @Autowired
    private RepositoryAluno repositoryAluno;

  @Autowired
    private RepositoryProfessor repositoryProfessor;

  @PostMapping(value =  "/login")
  public ResponseEntity<?> login(@RequestBody Usuario usuario) {
    Professor usuarioProfessor = repositoryProfessor.findById(usuario.getMatricula());
    Aluno usuariAluno = repositoryAluno.findById(usuario.getMatricula());

    if(usuarioProfessor != null){
      if(usuarioProfessor.getSenha().equals(usuario.getSenha())) {
         return new ResponseEntity<>(repositoryProfessor.findById(usuario.getMatricula()), HttpStatus.OK);
      }
     } else if(usuariAluno != null){
      if(usuariAluno.getSenha().equals(usuario.getSenha())) {
         return new ResponseEntity<>(repositoryAluno.findById(usuario.getMatricula()), HttpStatus.OK);
      }
     }
     return new ResponseEntity<>("Usuario não existe", HttpStatus.OK);
  }

}
