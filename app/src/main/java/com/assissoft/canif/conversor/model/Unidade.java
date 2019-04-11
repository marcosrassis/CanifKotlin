package com.assissoft.canif.conversor.model;

import java.io.Serializable;

/**
 * Created by Marcos on 27/08/2016.
 */
public class Unidade implements Serializable {
    private String sigla;
    private String descricao;
    private String valor;

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
