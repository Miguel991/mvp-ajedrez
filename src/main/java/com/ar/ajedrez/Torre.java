package com.ar.ajedrez;

public class Torre extends Ficha {

    public Torre(Color color) {
        super(color);
        nombre = "R";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return null;
    }
}
