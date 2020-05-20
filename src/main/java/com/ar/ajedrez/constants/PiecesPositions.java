package com.ar.ajedrez.constants;

import com.ar.ajedrez.*;

import java.util.Arrays;
import java.util.List;

public class PiecesPositions {

    public static List<Piece> PIEZAS_BLANCAS = Arrays.asList(
            new Rook(Color.WHITE),
            new Knight(Color.WHITE),
            new Bishop(Color.WHITE),
            new Queen(Color.WHITE),
            new King(Color.WHITE),
            new Bishop(Color.WHITE),
            new Knight(Color.WHITE),
            new Rook(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE),
            new Pawn(Color.WHITE)
    );

    public static List<Piece> PIEZAS_NEGRAS = Arrays.asList(
            new Rook(Color.BLACK),
            new Knight(Color.BLACK),
            new Bishop(Color.BLACK),
            new Queen(Color.BLACK),
            new King(Color.BLACK),
            new Bishop(Color.BLACK),
            new Knight(Color.BLACK),
            new Rook(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK),
            new Pawn(Color.BLACK)
    );


    public static List<Position> BLANCAS = Arrays.asList(
            Position.A1,
            Position.B1,
            Position.C1,
            Position.D1,
            Position.E1,
            Position.F1,
            Position.G1,
            Position.H1,
            Position.A2,
            Position.B2,
            Position.C2,
            Position.D2,
            Position.E2,
            Position.F2,
            Position.G2,
            Position.H2);

    public static List<Position> NEGRAS = Arrays.asList(
            Position.A8,
            Position.B8,
            Position.C8,
            Position.D8,
            Position.E8,
            Position.F8,
            Position.G8,
            Position.H8,
            Position.A7,
            Position.B7,
            Position.C7,
            Position.D7,
            Position.E7,
            Position.F7,
            Position.G7,
            Position.H7);
}
