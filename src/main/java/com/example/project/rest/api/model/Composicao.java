package com.example.project.rest.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.project.rest.api.model.model_id.ComposicaoId;

@Entity(name = "composicoes")
@IdClass(ComposicaoId.class)
public class Composicao {

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_avaliacao_c",referencedColumnName = "id")
    private Avaliacao avaliacao;

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_questao_c",referencedColumnName = "id")
    private Questao questao;

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    } 
}
