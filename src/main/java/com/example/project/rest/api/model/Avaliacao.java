package com.example.project.rest.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int num_questoes;

    @Column(nullable = false)
    private int mat_professor;

    

    public Avaliacao(){
        
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_questoes() {
        return num_questoes;
    }

    public void setNum_questoes(int num_questoes) {
        this.num_questoes = num_questoes;
    }

    public int getMat_professor() {
        return mat_professor;
    }

    public void setMat_professor(int mat_professor) {
        this.mat_professor = mat_professor;
    }
  
}
