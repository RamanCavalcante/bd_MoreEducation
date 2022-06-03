package com.example.project.rest.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity(name = "professores")
public class Professor {

    @Id
    private int matricula;
    
    @Column(nullable = false, length = 20)
    private String nome;

    @Column(nullable = false, length = 50)
    private String senha;

    @Column(nullable = false, length = 1)
    private byte acess = 1;

    @JsonManagedReference
    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
    private List<Avaliacao> avaliacoes;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
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
    public byte getAcess() {
        return acess;
    }
    public void setAcess(byte a) {
        this.acess = a;
    }
 
}