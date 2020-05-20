package com.ar.ajedrez;

import java.util.List;

public abstract class Piece {

    protected String name;

    private Color color;

    private Position position;

    public Piece(){}

    public Piece(Color color){
        this.color = color;
    }

    abstract public List<Cardinality> getMoves();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
