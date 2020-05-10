package com.ar.ajedrez;

public class Rey extends Ficha {

    public Rey(Color color) {
        super(color);
        nombre = "K";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return null;
    }
}
