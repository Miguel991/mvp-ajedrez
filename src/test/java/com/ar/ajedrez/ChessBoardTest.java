package com.ar.ajedrez;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardTest {

    private List<WrapperConfigBoard> configPosicionFicha;
    private Board board;

    @Before
    public void setup(){

        this.board = new Board();

        this.configPosicionFicha = new ArrayList<>();
        WrapperConfigBoard wrapperConfigBoard = new WrapperConfigBoard(Position.A2, new Pawn(Color.WHITE));
        configPosicionFicha.add(wrapperConfigBoard);
    }

    @Test
    public void moverUnPeonUnaCasillaEnSuPrimerMovimiento(){

        this.board.boardConfig(this.configPosicionFicha);
        this.board.movePiece(Position.A2, Position.A3);

        Piece pieceEsperada = this.board.getPiece(Position.A3);
        Piece posicionVacia = this.board.getPiece(Position.A2);

        assertThat(pieceEsperada.getName()).isEqualTo("P");
        assertThat(posicionVacia).isNull();

    }

    @Test
    public void moverUnPeonDosCasillas(){

        this.board.boardConfig(this.configPosicionFicha);
        this.board.movePiece(Position.A2, Position.A4);

        Piece pieceEsperada = this.board.getPiece(Position.A4);
        Piece posicionVacia = this.board.getPiece(Position.A2);

        assertThat(pieceEsperada).describedAs("No Existe pieza en la posicion A4").isNotNull();
        assertThat(pieceEsperada.getName()).isEqualTo("P");
        assertThat(posicionVacia).isNull();
    }

}
