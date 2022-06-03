package com.example.project.rest.api.model.model_id;

import java.io.Serializable;

public class ComposicaoId implements Serializable{

    private int avaliacao;
    private int questao;


    public ComposicaoId(int avaliacao, int questao) {
        this.avaliacao = avaliacao;
        this.questao = questao;
    }

    public ComposicaoId(){

    }


    public int getAvaliacao() {
        return avaliacao;
    }


    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }


    public int getQuestao() {
        return questao;
    }


    public void setQuestao(int questao) {
        this.questao = questao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + avaliacao;
        result = prime * result + questao;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ComposicaoId other = (ComposicaoId) obj;
        if (avaliacao != other.avaliacao)
            return false;
        if (questao != other.questao)
            return false;
        return true;
    }

}
