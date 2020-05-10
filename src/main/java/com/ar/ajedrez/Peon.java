package com.ar.ajedrez;

public class Peon extends Ficha {

    public Peon(Color color) {
        super(color);
        nombre = "P";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return Movimientos.PEON;
    }

}
