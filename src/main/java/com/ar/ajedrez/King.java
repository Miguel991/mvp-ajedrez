package com.ar.ajedrez;

import java.util.List;

public class King extends Piece {

    public King(Color color) {
        super(color);
        name = "K";
    }

    @Override
    public List<Cardinality> getMoves() {
        return null;
    }
}
