package com.ar.ajedrez;

import java.util.List;

public class BoardMananger {

    private Board board;

    public BoardMananger(Board board){
        this.board =  board;
    }

    public void movePiece(Position origin, Position destination) {

        Square source = this.board.getSquareByPosition(origin);
        Square dest =  null;

        if(source.isOcuppied()){

            Piece piece = source.getPiece();

            List<Cardinality> cardinalities = piece.getMoves();

            dest = this.board.getSquareByPosition( source.getNeighbourByCardinality( cardinalities.get(0) ));

            dest.setPiece(piece);

            source.setPiece(null);

        }

    }

}