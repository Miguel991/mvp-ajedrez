package com.ar.ajedrez;

import java.util.HashMap;
import java.util.Map;

public enum Position {

    A1("A","1"),
    B1("B","1"),
    C1("C","1"),
    D1("D","1"),
    E1("E","1"),
    F1("F","1"),
    G1("G","1"),
    H1("H","1"),
    A2("A","2"),
    B2("B","2"),
    C2("C","2"),
    D2("D","2"),
    E2("E","2"),
    F2("F","2"),
    G2("G","2"),
    H2("H","2"),
    A3("A","3"),
    B3("B","3"),
    C3("C","3"),
    D3("D","3"),
    E3("E","3"),
    F3("F","3"),
    G3("G","3"),
    H3("H","3"),
    A4("A","4"),
    B4("B","4"),
    C4("C","4"),
    D4("D","4"),
    E4("E","4"),
    F4("F","4"),
    G4("G","4"),
    H4("H","4"),
    A5("A","5"),
    B5("B","5"),
    C5("C","5"),
    D5("D","5"),
    E5("E","5"),
    F5("F","5"),
    G5("G","5"),
    H5("H","5"),
    A6("A","6"),
    B6("B","6"),
    C6("C","6"),
    D6("D","6"),
    E6("E","6"),
    F6("F","6"),
    G6("G","6"),
    H6("H","6"),
    A7("A","7"),
    B7("B","7"),
    C7("C","7"),
    D7("D","7"),
    E7("E","7"),
    F7("F","7"),
    G7("G","7"),
    H7("H","7"),
    A8("A","8"),
    B8("B","8"),
    C8("C","8"),
    D8("D","8"),
    E8("E","8"),
    F8("F","8"),
    G8("G","8"),
    H8("H","8");

    private final String column;
    private final String row;
    private final String name;

    private static Map<String, Position> positions = new HashMap<>();

    private Position(String column, String row){
        this.column = column;
        this.row = row;
        this.name = column + row;
    }

    static {

        for (Position position : values()) {
            positions.put(position.getName(), position);
        }

    }

    public static Position getPositionByName(String nombre){
        return positions.get(nombre);
    }

    public String getColumn() {
        return this.column;
    }

    public String getRow() {
        return this.row;
    }

    public String getName() {
        return this.name;
    }

}


