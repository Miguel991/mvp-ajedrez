package com.ar.ajedrez;

import java.util.Arrays;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
        name = "P";
    }

    @Override
    public List<Cardinality> getMoves() {
        return Arrays.asList(Cardinality.NORTH);
    }

}
