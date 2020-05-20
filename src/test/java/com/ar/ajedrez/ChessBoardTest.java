package com.ar.ajedrez;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardTest {

    @Test
    public void cuandoSeInicializaElTableroSeCompruebaLaPosicionDeLasPiezasBlancas(){

    }

    @Test
    public void cuandoSeInicializaElTableroSeCompruebaLaPosicionDeLasPiezasNegras(){

    }

    @Test
    public void moverUnPeonUnaCasillaEnSuPrimerMovimiento(){

        List<WrapperConfigBoard> configPosicionFicha = new ArrayList<>();
        WrapperConfigBoard wrapperConfigBoard = new WrapperConfigBoard(Position.A2, new Pawn(Color.WHITE));
        configPosicionFicha.add(wrapperConfigBoard);

        Board tablero = new Board();
        tablero.boardConfig(configPosicionFicha);

        tablero.movePiece(Position.A2, Position.A3);

        Piece pieceEsperada = tablero.getPiece(Position.A3);
        Piece posicionVacia = tablero.getPiece(Position.A2);

        assertThat(pieceEsperada.getName()).isEqualTo("P");
        assertThat(posicionVacia).isNull();

    }

    @Test
    public void moverUnPeonDosCasillasEnSuPrimerMovimiento(){
    }

    @Test
    public void moverUnPeonDosCasillasEnSuPrimerMovimientoConUnFichaEnLaCasillaDeEnfrenteNoSePuedeRalizarElMovimiento(){

    }

}
