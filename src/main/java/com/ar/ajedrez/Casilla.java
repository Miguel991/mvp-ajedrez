package com.ar.ajedrez;

public class Casilla {

    private Ficha ficha;

    public Casilla(){}

    public Casilla(Ficha ficha) {
        this.ficha = ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return this.ficha;
    }
}
