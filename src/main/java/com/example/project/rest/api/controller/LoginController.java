package com.example.project.rest.api.controller;

import com.example.project.rest.api.model.Aluno;
import com.example.project.rest.api.model.Professor;
import com.example.project.rest.api.repository.RepositoryAluno;
import com.example.project.rest.api.repository.RepositoryProfessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class LoginController {

  @Autowired
    private RepositoryAluno repositoryAluno;

  @Autowired
    private RepositoryProfessor repositoryProfessor;

  @GetMapping(value =  "login")
  public String login(@RequestBody Usuario usuario) {
    Professor usuarioProfessor = repositoryProfessor.findById(usuario.getMatricula());

    if(usuarioProfessor != null){
      if(usuarioProfessor.getSenha().equals(usuario.getSenha())) {
        return "Professor logado com sucesso";
      }
     } else {
       Aluno usuariAluno = repositoryAluno.findById(usuario.getMatricula());
      if(usuariAluno.getSenha().equals(usuario.getSenha())) {
        return "Aluno logado com sucesso";
      }
     }
    return "Usuario não existe";
  }

}
