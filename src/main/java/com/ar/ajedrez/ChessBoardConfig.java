package com.ar.ajedrez;

import com.ar.ajedrez.constants.PiecesPositions;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ChessBoardConfig {

    public void addPiecesToBoard(List<WrapperConfigBoard> pieces, EnumMap<Position, Square> board ){

        Square squareTablero = null;

        for (WrapperConfigBoard configSquare: pieces) {

            squareTablero = board.get(configSquare.getPosition());

            squareTablero.setPiece(configSquare.getPiece());

        }
    }

    private void agregarPiezas(Map<Position, Square> tableroInicial) {

        Piece piece = null;
        Square square = null;


        for(int i = 0; i < PiecesPositions.BLANCAS.size(); i++){
            piece = PiecesPositions.PIEZAS_BLANCAS.get(i);
            piece.setColor(Color.WHITE);
            piece.setPosition(PiecesPositions.BLANCAS.get(i));
            square = tableroInicial.get(PiecesPositions.BLANCAS.get(i));
            square.setPiece(piece);
        }

        for(int i = 0; i < PiecesPositions.NEGRAS.size(); i++){
            piece = PiecesPositions.PIEZAS_NEGRAS.get(i);
            piece.setPosition(PiecesPositions.NEGRAS.get(i));
            piece.setColor(Color.BLACK);
            square = tableroInicial.get(PiecesPositions.NEGRAS.get(i));
            square.setPiece(piece);
        }

    }


}
