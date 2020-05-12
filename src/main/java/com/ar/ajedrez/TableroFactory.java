package com.ar.ajedrez;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableroFactory {

    public static Map<Posicion, Casilla> crearTableroCon(List<WrapperCasilla> fichas) {

        Map<Posicion, Casilla> tablero = crearCasillas();

        Casilla vacia = null;
        Ficha ficha =  null;

        for (WrapperCasilla casillas: fichas){
                vacia = tablero.get(casillas.getPosicion());
                ficha = casillas.getFicha();
                ficha.setPosicion(casillas.getPosicion());
                vacia.setFicha(ficha);
        }

        return tablero;
    }

    private static Map<Posicion, Casilla> crearCasillas(){

        Map<Posicion, Casilla> casillas = new HashMap<>();

        for (Posicion posicion: Posicion.values()) {
            casillas.put(posicion, new Casilla());
        }

        return casillas;
    }
}
