package com.ar.ajedrez;

import java.util.Map;

public class WrapperConfigSquare {

        private Map<Cardinality, Position> neighbour;
        private Square main;

        public WrapperConfigSquare(Square square, Map<Cardinality, Position> neighbour){
            this.neighbour = neighbour;
            this.main = square;
        }

        public Square getMain() {
            return main;
        }

        public Map<Cardinality, Position> getNeighbour() {
            return neighbour;
        }

}
