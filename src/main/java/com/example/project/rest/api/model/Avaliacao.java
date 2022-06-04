package com.example.project.rest.api.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity(name = "avaliacoes")
public class Avaliacao implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int num_questoes;

    @ManyToOne
    @JoinColumn(name = "mat_professor",referencedColumnName = "matricula")
    private Professor professor;

    /*@JsonManagedReference
    @OneToMany(mappedBy = "avaliacao", fetch = FetchType.EAGER)
    private List<Composicao> composicaos;*/
    

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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

     
}
