package com.ar.ajedrez;

public class WrapperCasilla {

    private Ficha ficha;
    private Posicion posicion;

    public WrapperCasilla(Posicion posicion, Ficha ficha){
        this.ficha = ficha;
        this.posicion= posicion;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
