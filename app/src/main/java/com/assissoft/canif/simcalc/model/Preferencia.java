package com.assissoft.canif.simcalc.model;

/**
 * Created by Marcos on 12/11/2016.
 */
public class Preferencia {

    private String registro;
    private int casasdecimais;
    private int notacao;
    private long _id;

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getCasasdecimais() {
        return casasdecimais;
    }

    public void setCasasdecimais(int casasdecimais) {
        this.casasdecimais = casasdecimais;
    }

    public int getNotacao() {
        return notacao;
    }

    public void setNotacao(int notacao) {
        this.notacao = notacao;
    }

}
