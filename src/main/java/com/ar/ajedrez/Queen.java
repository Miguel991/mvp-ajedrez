package com.ar.ajedrez;

import java.util.List;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color);
        name = "Q";
    }

    @Override
    public List<Cardinality> getMoves() {
        return null;
    }
}
