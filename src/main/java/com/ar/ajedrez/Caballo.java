package com.ar.ajedrez;

public class Caballo extends Ficha {

    public Caballo(Color color) {
        super(color);
        nombre = "N";
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
       return Movimientos.CABALLO;
    }
}
