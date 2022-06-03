package com.example.project.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "turmas")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(nullable = false, length = 20)
    public String nome;
    
    @Column(nullable = false, length = 10)
    public int mat_professor;

    

    /**
     * gets e sets
     * 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public int getMat_professor() {
        return mat_professor;
    }

    public void setMat_professor(int mat_professor) {
        this.mat_professor = mat_professor;
    }
       
}
