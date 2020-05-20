package com.ar.ajedrez;

import java.util.List;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
        name = "N";
    }

    @Override
    public List<Cardinality> getMoves() {
       return null;
    }
}
