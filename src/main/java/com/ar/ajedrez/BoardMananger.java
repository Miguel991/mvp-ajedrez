package com.ar.ajedrez;

import java.util.List;

public class BoardMananger {

    private Board board;

    public BoardMananger(Board board){
        this.board =  board;
    }

    public void movePiece(Position origin, Position destination) {

        Square source = this.board.getSquareByPosition(origin);
        Square destiny = this.board.getSquareByPosition(destination);

        List<Square> dest =  null;
        List<Position> destPositions = null;

        if(source.isOcuppied()){

            Piece piece = source.getPiece();

            destPositions = source.getNeighboursByCardinalities( piece.getMoves());

            dest = this.board.getSquaresByPositions(destPositions);

            if(dest.contains(destiny)){

                if(source.getNeighbourByCardinality(Cardinality.NORTH).equals(destiny.getPosition())){

                    if(!destiny.isOcuppied()){
                        movePieceOnBoard(source, destiny, piece);
                    }

                }else{

                    if(destiny.isOcuppied()){

                        Piece pieceOnDestiny = destiny.getPiece();

                        if(pieceOnDestiny.getColor() != piece.getColor() ){

                            movePieceOnBoard(source, destiny, piece);

                        }
                    }
                }

            }

            if(!areNeighbour(origin , destination)) {

                Position north = source.getNeighbourByCardinality(piece.getMoves().get(0));

                Square squareNorth = this.board.getSquareByPosition(north);

                Position secondNorth = squareNorth.getNeighbourByCardinality(piece.getMoves().get(0));

                destiny = this.board.getSquareByPosition( secondNorth );

                movePieceOnBoard(source, destiny, piece);

            }
        }

    }

    private void movePieceOnBoard(Square source, Square destiny, Piece piece) {

        destiny.setPiece(piece);
        source.setPiece(null);

    }

    private boolean areNeighbour(Position source , Position destination) {
        Square src = this.board.getSquareByPosition(source);
        return src.contain(destination);
    }

}