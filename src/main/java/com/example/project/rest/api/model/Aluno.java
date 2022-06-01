package com.example.project.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "alunos")
public class Aluno {
   
    
    @Column(nullable = false, length = 50)
    public String nome;

    @Id
    public int matricula;
    
    @Column(nullable = false, length = 50)
    public String senha;

    @Column(nullable = false, length = 1)
    public byte acess;

    @Column(nullable = false)
    public int id_turma_a;

    /** 
     * gets e sets
     */

    public int getId_turma() {
        return id_turma_a;
    }
    public void setId_turma(int id_turma) {
        this.id_turma_a = id_turma;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public byte getAcess() {
        return acess;
    }
    public void setAcess(byte acess) {
        this.acess = acess;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
