package com.example.project.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.project.rest.api.model.model_id.AlternativaId;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "alternativas")
@IdClass(AlternativaId.class) // indica onde está a chave primária composta
public class Alternativa {

  @Id
  @JsonBackReference
  @ManyToOne // Indica que é um relacionamento muitos para 1 
  @JoinColumn(name = "cod_questao_a",referencedColumnName = "id")
  private Questao questao;
  
  @Id
  private int letra;

  @Column(nullable = false)
  private String resposta;

  @Column(nullable = false)
  private boolean eh_correta;


  /** 
     * gets e sets
     */

  public int getLetra() {
    return letra;
  }
  public void setLetra(int letra) {
      this.letra = letra;
  }
  public String getResposta() {
    return resposta;
  }
  public void setResposta(String resposta) {
    this.resposta = resposta;
  }
  public boolean getEh_correta() {
    return eh_correta;
  }
  public void setEh_correta(boolean eh_correta) {
    this.eh_correta = eh_correta;
  }
  public void setQuestao(Questao questao) {
    this.questao = questao;
  }
  public Questao getQuestao() {
    return questao;
  }

}
