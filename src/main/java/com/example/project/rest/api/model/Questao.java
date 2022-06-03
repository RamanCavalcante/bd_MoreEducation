package com.example.project.rest.api.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

;

@Entity(name = "questoes")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String enunciado;

    @Column(nullable = false)
    private int mat_professor;

    @JsonManagedReference
    @OneToMany(mappedBy = "questao", fetch = FetchType.EAGER)
    private List<Alternativa> alternativas;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEnunciado() {
        return enunciado;
    }
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    public long getMat_professor() {
        return mat_professor;
    }
    public void setMat_professor(int mat_professor) {
        this.mat_professor = mat_professor;
    }
  
}
