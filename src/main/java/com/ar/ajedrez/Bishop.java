package com.ar.ajedrez;

import java.util.List;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
        name = "B";
    }

    @Override
    public List<Cardinality> getMoves() {
        return null;
    }
}
