package com.example.project.rest.api.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int num_questoes;

    @Column(nullable = false)
    private int mat_professor;

    @ManyToMany(targetEntity=Questao.class)
    private List<Questao> lista_de_questoes;

    public Avaliacao(){
        
    }

    public Avaliacao(int id, int num_questoes, int mat_professor, List<Questao> lista_de_questoes) {
        this.id = id;
        this.num_questoes = num_questoes;
        this.mat_professor = mat_professor;
        this.lista_de_questoes = lista_de_questoes;
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
