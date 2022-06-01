package com.example.project.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "alternativas")
public class Alternativa {
  
  @Id
  private int letra;

  @Column(nullable = false)
  private String resposta;

  @Column(nullable = false)
  private boolean eh_correta;

  @Column(nullable = false)
  private int cod_questao_a;

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
  public int getCod_questao_a() {
    return cod_questao_a;
  }
  public void setEh_correta(int cod_questao_a) {
    this.cod_questao_a = cod_questao_a;
  }
}
