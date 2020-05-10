package com.ar.ajedrez;

public class Peon extends Ficha {

    private boolean isPrimerMovimiento = true;

    public Peon(Color color) {
        super(color);
        nombre = "P";
    }

    public boolean esPrimerMovimiento(){
        return isPrimerMovimiento;
    }

    @Override
    public Movimientos obtenerMovimientosDeFicha() {
        return Movimientos.PEON;
    }

    public void setPrimerMovimiento(boolean primerMovimiento) {
        isPrimerMovimiento = primerMovimiento;
    }
}
