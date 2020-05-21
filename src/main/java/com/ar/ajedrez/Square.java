package com.ar.ajedrez;

import java.util.EnumMap;

public class Square {

    private Piece piece;
    private Position position;

    private EnumMap<Cardinality, Position> neighbour;

    public Square(){}

    public Square(Position position){
        this.position = position;
        this.neighbour = new EnumMap(Cardinality.class);
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public Position getPosition() {
        return position;
    }

    public void addNeighbourPosition(Cardinality cardinality, Position neighbour){
        this.neighbour.put(cardinality, neighbour);
    }

    public Position getNeighbourByCardinality(Cardinality cardinality){
        return this.neighbour.get(cardinality);
    }

    public boolean isOcuppied() {
        return this.piece == null? false : true;
    }

    public boolean contain(Position destination) {
        return this.neighbour.containsValue(destination);
    }
}
