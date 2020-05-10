package com.ar.ajedrez;

public class Reina extends Ficha {

    public Reina(Color color) {
        super(color);
        nombre = "Q";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return null;
    }
}
