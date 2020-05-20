package com.ar.ajedrez;

public class WrapperConfigBoard {

    private Piece piece;
    private Position position;

    public WrapperConfigBoard(Position position, Piece piece){
        this.piece = piece;
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
