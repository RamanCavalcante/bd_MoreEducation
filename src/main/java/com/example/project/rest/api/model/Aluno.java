package com.example.project.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity(name = "alunos")
public class Aluno {
   
    // @Id
    @JsonBackReference
    @ManyToOne 
    @JoinColumn(name = "id_turma_a",referencedColumnName = "id", insertable = false, updatable = false)
    private Turma turma;
    
    @Column(nullable = false, length = 50)
    private String nome;

    @Id
    private int matricula;
    
    @Column(nullable = false, length = 50)
    private String senha;

    @Column(nullable = false, length = 1)
    private byte acess;


    @Column(nullable = false)
    private int id_turma_a;
  
    @ManyToOne
    @JoinColumn(name = "id_turma_a",referencedColumnName = "id")
    private Turma turma;


    /** 
     * gets e sets
     */

    

    public String getNome() {
        return nome;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
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

    // public Turma getTurma() {
    //     return turma;
    // }
    // public void setTurma(Turma turma) {
    //     this.turma = turma;
    // }
}
