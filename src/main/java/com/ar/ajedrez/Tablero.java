package com.ar.ajedrez;

import com.ar.ajedrez.Constantes.PosicionesPiezas;

import java.util.*;

public class Tablero {

   private Map<Posicion, Casilla> casillas;

   public Tablero(){
       this.casillas = crearCasillas();
   }

    private Map<Posicion, Casilla> crearCasillas() {

       Map<Posicion, Casilla> casillas = new HashMap<>();

        for (Posicion posicion: Posicion.values()) {
            casillas.put(posicion, new Casilla());
        }

        agregarPiezas(casillas);

       return casillas;
    }

    public Ficha obtenerPieza(Posicion origen) {
        return this.casillas.get(origen).getFicha();
    }

    public void moverPieza(Posicion origen,Posicion destino ) {

        Casilla casillaOrigen = this.casillas.get(origen);
        //comprobar si existe una pieza en la casilla origen

        Casilla casillaDestino =  null;

        Ficha ficha = casillaOrigen.getFicha();

        if(ficha != null){
            casillaDestino = this.casillas.get(destino);
            casillaDestino.setFicha(ficha);
            casillaOrigen.setFicha(null);
        }
    }

    public List<Posicion> obtenerPosicionesValidasAPartirDeLa(Posicion posicion) {

       Ficha ficha = this.casillas.get(posicion).getFicha();

       Movimientos movimientosFicha = ficha.obtenerMovimientosDeFicha();

       List<Posicion> posicionesDisponibles = validarMovimiento(movimientosFicha, posicion,ficha.getNombre());

       return posicionesDisponibles;
    }

    private List<Posicion> validarMovimiento(Movimientos movimientosFicha, Posicion posicion, String nombre) {

       String puntoCardinal = movimientosFicha.obtenerPuntoCardinalPorNombre(nombre);


       return null;
    }

    public Map<Posicion, Casilla> getCasillas(){
       return this.casillas;
    }

    private void agregarPiezas(Map<Posicion, Casilla> tableroInicial) {

        Ficha ficha = null;
        Casilla casilla = null;


        for(int i = 0; i < PosicionesPiezas.BLANCAS.size(); i++){
            ficha = PosicionesPiezas.PIEZAS_BLANCAS.get(i);
            ficha.setColor(Color.BLANCO);
            casilla = tableroInicial.get(PosicionesPiezas.BLANCAS.get(i));
            casilla.setFicha(ficha);
        }

        for(int i = 0; i < PosicionesPiezas.NEGRAS.size(); i++){
            ficha = PosicionesPiezas.PIEZAS_NEGRAS.get(i);
            ficha.setColor(Color.NEGRO);
            casilla = tableroInicial.get(PosicionesPiezas.NEGRAS.get(i));
            casilla.setFicha(ficha);
        }

    }
}
