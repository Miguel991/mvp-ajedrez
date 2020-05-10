package com.ar.ajedrez;

public class Alfil extends Ficha {

    public Alfil(Color color) {
        super(color);
        nombre = "B";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return null;
    }
}
