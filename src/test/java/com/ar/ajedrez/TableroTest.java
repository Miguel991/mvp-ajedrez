package com.ar.ajedrez;

import com.ar.ajedrez.Constantes.PosicionesPiezas;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TableroTest {

    //la logica de movimientos no se deberia mezclar con el modelo de juego

    //yo deberia poder crear un tablero con las piezas que necesito solamente

    //tengo que extraer la logica de creacion del tablero de la clase tablero

    @Test
    public void cuandoSeInicializaElTableroSeCompruebaLaPosicionDeLasPiezasBlancas(){

        Map<Posicion, Casilla> tableroInicial = crearTableroInicial();

        Tablero tablero = new Tablero();

        Map<Posicion, Casilla> tableroConPiezas =  tablero.getCasillas();

        Casilla casillaConPieza =  null;
        Casilla casilla = null;
        Ficha ficha = null;
        Ficha fichaCasilla = null;

        for(Posicion posicion: PosicionesPiezas.BLANCAS){

            casillaConPieza = tableroConPiezas.get(posicion);
            fichaCasilla = casillaConPieza.getFicha();

            casilla = tableroInicial.get(posicion);
            ficha = casilla.getFicha();

            assertThat(fichaCasilla).isNotNull();
            assertThat(ficha.getNombre()).isEqualTo(fichaCasilla.getNombre());

        }

    }

    @Test
    public void cuandoSeInicializaElTableroSeCompruebaLaPosicionDeLasPiezasNegras(){

        Map<Posicion, Casilla> tableroInicial = crearTableroInicial();

        Tablero tablero = new Tablero();

        Map<Posicion, Casilla> tableroConPiezas =  tablero.getCasillas();

        Casilla casillaConPieza =  null;
        Casilla casilla = null;
        Ficha ficha = null;
        Ficha fichaCasilla = null;

        for(Posicion posicion: PosicionesPiezas.NEGRAS){

            casillaConPieza = tableroConPiezas.get(posicion);
            fichaCasilla = casillaConPieza.getFicha();

            casilla = tableroInicial.get(posicion);
            ficha = casilla.getFicha();

            assertThat(fichaCasilla).isNotNull();
            assertThat(ficha.getNombre()).isEqualTo(fichaCasilla.getNombre());
            assertThat(ficha.getColor()).isEqualTo(fichaCasilla.getColor());

        }

    }

    @Test
    public void moverPeonBlancoDeLaPosicionA2ALaPosicionA3(){

        Tablero tablero = new Tablero();

        tablero.moverPieza(Posicion.A2, Posicion.A3);

        Ficha fichaEsperada = tablero.obtenerPieza(Posicion.A3);
        Ficha posicionVacia = tablero.obtenerPieza(Posicion.A2);

        assertThat(fichaEsperada.getNombre()).isEqualTo("P");
        assertThat(posicionVacia).isNull();

    }

    @Test
    public void moverPeonDosCasillasEnElTableroEnSuPrimerMovimiento(){

        Tablero tablero = new Tablero();

        tablero.moverPieza(Posicion.A2, Posicion.A4);

        Peon fichaEsperada = (Peon) tablero.obtenerPieza(Posicion.A4);

        assertThat(fichaEsperada.esPrimerMovimiento()).isEqualTo(false);
    }

    @Test
    public void cuandoUnPeonNoHizoNingunMovimientoSePuedeMoverDosCasillas() {

        Tablero tablero = new Tablero();

        Peon peon = (Peon) tablero.obtenerPieza(Posicion.B2);

        assertThat(peon.esPrimerMovimiento()).isTrue();

    }


    private Map<Posicion, Casilla> crearTableroInicial(){

        Map<Posicion, Casilla> tableroInicial = new HashMap<>();

        for (Posicion posicion : Posicion.values()){
            tableroInicial.put(posicion, new Casilla());
        }

        agregarPiezas(tableroInicial);

        return tableroInicial;
    }

    private void agregarPiezas(Map<Posicion, Casilla> tableroInicial) {

        Ficha ficha = null;
        Casilla casilla = null;


        for(int i = 0; i < PosicionesPiezas.BLANCAS.size(); i++){
            ficha = PosicionesPiezas.PIEZAS_BLANCAS.get(i);
            ficha.setColor(Color.BLANCO);
            casilla = tableroInicial.get(PosicionesPiezas.BLANCAS.get(i));
            casilla.setFicha(ficha);

            tableroInicial.put(PosicionesPiezas.BLANCAS.get(i), casilla);
        }

        for(int i = 0; i < PosicionesPiezas.NEGRAS.size(); i++){
            ficha = PosicionesPiezas.PIEZAS_NEGRAS.get(i);
            ficha.setColor(Color.NEGRO);
            casilla = tableroInicial.get(PosicionesPiezas.NEGRAS.get(i));
            casilla.setFicha(ficha);
            tableroInicial.put(PosicionesPiezas.NEGRAS.get(i), casilla);
        }

    }


}
