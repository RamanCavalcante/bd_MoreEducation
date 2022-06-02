package com.example.project.rest.api.model.model_id;

import java.io.Serializable;

// Essa classe é criada quando se tem uma chave primária composta
// Essa classe não vamos usar para nada , que irá utlizar ela é o jpa

public class AlternativaId implements Serializable{

    private int questao;
    private int letra;

    public AlternativaId(int questao, int letra) {
        this.questao = questao;
        this.letra = letra;
    }

    public AlternativaId() {
    }

    public int getQuestao() {
        return questao;
    }

    public void setQuestao(int questao) {
        this.questao = questao;
    }

    public int getLetra() {
        return letra;
    }

    public void setLetra(int letra) {
        this.letra = letra;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + letra;
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
        AlternativaId other = (AlternativaId) obj;
        if (letra != other.letra)
            return false;
        if (questao != other.questao)
            return false;
        return true;
    }
}
