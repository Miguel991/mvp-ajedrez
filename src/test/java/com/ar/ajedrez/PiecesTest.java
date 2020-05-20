package com.ar.ajedrez;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PiecesTest {

    @Test
    public void crearPeonConColorBlanco() {

        Piece peon = new Pawn(Color.WHITE);
        Assertions.assertThat(peon.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearPeonConColorNegro() {

        Piece peon = new Pawn(Color.BLACK);
        Assertions.assertThat(peon.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    public void crearCaballoConColorBlanco(){
        Piece caballo = new Knight(Color.WHITE);

        Assertions.assertThat(caballo.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearCaballoConColorNegro(){
        Piece caballo = new Knight(Color.BLACK);

        Assertions.assertThat(caballo.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    public void crearAlfilConColorBlanco(){
        Piece alfil = new Bishop(Color.WHITE);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearAlfilConColorNegro(){
        Piece alfil = new Bishop(Color.BLACK);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    public void crearTorreConColorBlanco(){
        Piece torre = new Rook(Color.WHITE);

        Assertions.assertThat(torre.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearTorreConColorNegro(){
        Piece alfil = new Bishop(Color.BLACK);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    public void crearReyConColorBlanco(){
        Piece rey = new King(Color.WHITE);

        Assertions.assertThat(rey.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearReyConColorNegro(){
        Piece alfil = new Bishop(Color.BLACK);

        Assertions.assertThat(alfil.getColor()).isEqualTo(Color.BLACK);
    }

    @Test
    public void crearReinaConColorBlanco(){
        Piece reina = new Queen(Color.WHITE);

        Assertions.assertThat(reina.getColor()).isEqualTo(Color.WHITE);
    }

    @Test
    public void crearReinaConColorNegro(){
        Piece reina = new Queen(Color.BLACK);

        Assertions.assertThat(reina.getColor()).isEqualTo(Color.BLACK);
    }
}

