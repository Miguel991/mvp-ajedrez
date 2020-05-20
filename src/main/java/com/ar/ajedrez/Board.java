package com.ar.ajedrez;

import java.util.*;

public class Board {

    private BoardMananger manager;
    private ChessBoadFactory chessBoadFactory;
    private ChessBoardConfig chessBoardConfig;

   private EnumMap<Position, Square> square;

   public Board(){
       this.chessBoadFactory = new ChessBoadFactory();
       this.chessBoardConfig = new ChessBoardConfig();
       this.square = this.chessBoadFactory.crearTablero();
       this.manager = new BoardMananger(this);
   }

    public Piece getPiece(Position origin) {
        return this.square.get(origin).getPiece();
    }

    public void movePiece(Position origin, Position destination ) {
       this.manager.movePiece(origin, destination);
    }

    public void boardConfig(List<WrapperConfigBoard> piecesConfig){
       this.chessBoardConfig.addPiecesToBoard(piecesConfig,this.square);
    }

    public Square getSquareByPosition(Position origin) {
       return this.square.get(origin);
    }
}
