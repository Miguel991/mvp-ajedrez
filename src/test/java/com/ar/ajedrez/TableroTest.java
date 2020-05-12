package com.ar.ajedrez;

import com.ar.ajedrez.Constantes.PosicionesPiezas;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class TableroTest {

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
    public void moverUnPeonUnaCasillaEnSuPrimerMovimiento(){

        Tablero tablero = new Tablero();

        tablero.moverPieza(Posicion.A2, Posicion.A3);

        Ficha fichaEsperada = tablero.obtenerPieza(Posicion.A3);
        Ficha posicionVacia = tablero.obtenerPieza(Posicion.A2);

        assertThat(fichaEsperada.getNombre()).isEqualTo("P");
        assertThat(posicionVacia).isNull();

    }

    @Test
    public void moverUnPeonDosCasillasEnSuPrimerMovimiento(){

        Tablero tablero = new Tablero();
        String nombrePeon = "P";

        tablero.moverPieza(Posicion.B2, Posicion.B4);

        Ficha peonMovido = tablero.obtenerPieza(Posicion.B4);

        Ficha casillaVacia = tablero.obtenerPieza(Posicion.B2);

        assertThat(peonMovido.getNombre()).as("Valida que exista un peon en la casilla").isNotNull();
        assertThat(casillaVacia).isNull();

    }

    @Test
    public void moverUnPeonDosCasillasEnSuPrimerMovimientoConUnFichaEnLaCasillaDeEnfrenteNoSePuedeRalizarElMovimiento(){

        List<WrapperCasilla> fichas = new ArrayList<>();

        WrapperCasilla casillaUno = new WrapperCasilla(Posicion.A2, new Peon(Color.BLANCO));
        WrapperCasilla casillaDos = new WrapperCasilla(Posicion.A3, new Peon(Color.BLANCO));

        fichas.add(casillaUno);
        fichas.add(casillaDos);

        Tablero tablero =  new Tablero(TableroFactory.crearTableroCon(fichas));

        tablero.moverPieza(Posicion.A2, Posicion.A4);

        Ficha peonBlanco = tablero.obtenerPieza(Posicion.A2);
        Ficha sinPieza = tablero.obtenerPieza(Posicion.A4);

        assertThat(peonBlanco).isInstanceOf(Peon.class);
        assertThat(sinPieza).isNull();

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
