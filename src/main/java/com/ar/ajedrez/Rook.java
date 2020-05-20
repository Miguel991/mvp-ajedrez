package com.ar.ajedrez;

import java.util.List;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
        name = "R";
    }

    @Override
    public List<Cardinality> getMoves() {
        return null;
    }
}
