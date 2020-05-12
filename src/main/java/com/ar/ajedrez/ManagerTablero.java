package com.ar.ajedrez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ManagerTablero {

    private Map<Posicion, Casilla> tablero;

    public ManagerTablero(Map<Posicion, Casilla> tablero){
        this.tablero =  tablero;
    }

    private static final List<String> columnas = Arrays.asList("A","B","C","D","E","F","G","H");

    public void moverPieza(Posicion origen, Posicion destino, Map<Posicion, Casilla> tablero) {

        Casilla casillaOrigen = tablero.get(origen);

        Casilla casillaDestino =  null;

        Ficha ficha = casillaOrigen.getFicha();

        if(ficha != null){

             List<Posicion> posiciones = obtenerPosicionesDisponibles(ficha);

             if(posiciones.contains(destino)){

                 casillaDestino = tablero.get(destino);
                 ficha.setPosicion(destino);
                 casillaDestino.setFicha(ficha);
                 casillaOrigen.setFicha(null);

             }

        }

    }

    private List<Posicion> obtenerPosicionesDisponibles(Ficha ficha) {

        List<Posicion> posicionesDisponibles = null;

        switch (ficha.getNombre()){
            case ("P"):
                posicionesDisponibles = obtenerPosicionesParaPeon(ficha);
                break;
            case ("R"):

                break;
            case ("N"):

                break;
            case ("B"):

                break;
            case ("Q"):

                break;
            case ("K"):

                break;

        }

        return posicionesDisponibles;
    }

    private List<Posicion> obtenerPosicionesParaPeon(Ficha ficha) {

        List<Posicion> posiciones = new ArrayList<>();

        Posicion origen =  ficha.getPosicion();

        String columna = origen.getColumna();
        String fila = origen.getFila();

        posiciones = calcularPosiblesPosicionesParaPeon(columna, fila);



        //validar si las en diagonal estan vacias

        // validar si hay una ficha en el camino

        // Arrays.asList("A","B","C","D","E");

        return posiciones;
    }

    private List<Posicion> calcularPosiblesPosicionesParaPeon(String columna, String fila) {

        String posicionInicialDePeon = "2";

        List<Posicion> posiciones = new ArrayList<>();

        int indiceColumnaActual = this.columnas.indexOf(columna);

        int indiceColumnaDerecha = indiceColumnaActual + 1;
        int indiceColumnaIzquierda = indiceColumnaActual -1;

        int filaSiguiente = Integer.valueOf(fila) + 1;


        if(!(indiceColumnaIzquierda == -1)){
            String nombreColumnaIzquierda = this.columnas.get(indiceColumnaIzquierda);
            String casillaUno = nombreColumnaIzquierda + filaSiguiente;
            posiciones.add(Posicion.obtenerPosicionPorNombre(casillaUno));
        }

        String nombreColumnaDerecha = this.columnas.get(indiceColumnaDerecha);


        String casillaDos = columna + filaSiguiente;

        Casilla casillaSuperior =  tablero.get(Posicion.obtenerPosicionPorNombre(casillaDos));

        if(casillaSuperior.getFicha() == null){
            posiciones.add(Posicion.obtenerPosicionPorNombre(casillaDos));
            filaSiguiente = filaSiguiente + 1;
            String casillaAdicionalEnPrimerMovimiento = columna + filaSiguiente;
            posiciones.add(Posicion.obtenerPosicionPorNombre(casillaAdicionalEnPrimerMovimiento));
        }

        String casillaTres = nombreColumnaDerecha + filaSiguiente;

        posiciones.add(Posicion.obtenerPosicionPorNombre(casillaTres));

        return posiciones;
    }

}