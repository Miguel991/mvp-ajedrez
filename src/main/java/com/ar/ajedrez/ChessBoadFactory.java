package com.ar.ajedrez;

import java.util.*;

public class ChessBoadFactory {

        public EnumMap<Position, Square> crearTablero(){

            List<WrapperConfigSquare> WrapperConfigSquare = obtenerGrupoDeCasillas();

            EnumMap<Position, Square> tablero =  new EnumMap<>(Position.class);

            for ( WrapperConfigSquare casilla : WrapperConfigSquare) {

                asociarPrincipalConVecinas(casilla.getMain(), casilla.getNeighbour());
                tablero.put(casilla.getMain().getPosition() , casilla.getMain());
            }

            return tablero;
        }

        private List<WrapperConfigSquare> obtenerGrupoDeCasillas() {

            List<WrapperConfigSquare> casillas = new ArrayList<>();

            Map<Cardinality, Position> vecinasA1 = new HashMap<>();
            vecinasA1.put(Cardinality.EAST, Position.B1);
            vecinasA1.put(Cardinality.NORTHWEST, Position.B2);
            vecinasA1.put(Cardinality.NORTH, Position.A2);

            Square A1 = new Square(Position.A1);
            WrapperConfigSquare gA1 =  new WrapperConfigSquare(A1, vecinasA1);
            casillas.add(gA1);

            Map<Cardinality, Position>  vecinasB1 = new HashMap<>();
            vecinasB1.put(Cardinality.EAST, Position.C1);
            vecinasB1.put(Cardinality.NORTHEAST, Position.C2);
            vecinasB1.put(Cardinality.NORTH, Position.B2);
            vecinasB1.put(Cardinality.NORTHWEST, Position.A2);
            vecinasB1.put(Cardinality.WEST, Position.A1);

            Square B1 = new Square(Position.B1);
            WrapperConfigSquare gB1 =  new WrapperConfigSquare(B1, vecinasB1);
            casillas.add(gB1);

            Map<Cardinality, Position>  vecinasC1 = new HashMap<>();
            vecinasC1.put(Cardinality.EAST, Position.B1);
            vecinasC1.put(Cardinality.NORTHEAST, Position.B2);
            vecinasC1.put(Cardinality.NORTH, Position.C2);
            vecinasC1.put(Cardinality.NORTHWEST, Position.D2);
            vecinasC1.put(Cardinality.WEST, Position.D1);

            Square C1 = new Square(Position.C1);
            WrapperConfigSquare gC1 =  new WrapperConfigSquare(C1, vecinasC1);
            casillas.add(gC1);

            Map<Cardinality, Position>  vecinasD1 = new HashMap<>();
            vecinasD1.put(Cardinality.EAST, Position.E1);
            vecinasD1.put(Cardinality.NORTHEAST, Position.E2);
            vecinasD1.put(Cardinality.NORTH, Position.D2);
            vecinasD1.put(Cardinality.NORTHWEST, Position.C2);
            vecinasD1.put(Cardinality.WEST, Position.C1);

            Square D1 = new Square(Position.D1);
            WrapperConfigSquare gD1 =  new WrapperConfigSquare(D1, vecinasD1);
            casillas.add(gD1);

            Map<Cardinality, Position>  vecinasE1 = new HashMap<>();
            vecinasE1.put(Cardinality.EAST, Position.F1);
            vecinasE1.put(Cardinality.NORTHEAST, Position.F2);
            vecinasE1.put(Cardinality.NORTH, Position.E2);
            vecinasE1.put(Cardinality.NORTHWEST, Position.D2);
            vecinasE1.put(Cardinality.WEST, Position.D1);

            Square E1 = new Square(Position.E1);
            WrapperConfigSquare gE1 =  new WrapperConfigSquare(E1, vecinasE1);
            casillas.add(gE1);


            Map<Cardinality, Position>  vecinasF1 = new HashMap<>();
            vecinasF1.put(Cardinality.EAST, Position.E1);
            vecinasF1.put(Cardinality.NORTHEAST, Position.E2);
            vecinasF1.put(Cardinality.NORTH, Position.F2);
            vecinasF1.put(Cardinality.NORTHWEST, Position.G2);
            vecinasF1.put(Cardinality.WEST, Position.G1);

            Square F1 = new Square(Position.F1);
            WrapperConfigSquare gF1 =  new WrapperConfigSquare(F1, vecinasF1);
            casillas.add(gF1);

            Map<Cardinality, Position>  vecinasG1 = new HashMap<>();
            vecinasG1.put(Cardinality.EAST, Position.F1);
            vecinasG1.put(Cardinality.NORTHEAST, Position.F2);
            vecinasG1.put(Cardinality.NORTH, Position.G2);
            vecinasG1.put(Cardinality.NORTHWEST, Position.H2);
            vecinasG1.put(Cardinality.WEST, Position.H1);

            Square G1 = new Square(Position.G1);
            WrapperConfigSquare gG1 =  new WrapperConfigSquare(G1, vecinasG1);
            casillas.add(gG1);

            Map<Cardinality, Position>  vecinasH1 = new HashMap<>();
            vecinasH1.put(Cardinality.NORTH, Position.H2);
            vecinasH1.put(Cardinality.NORTHWEST, Position.G2);
            vecinasH1.put(Cardinality.WEST, Position.G1);

            Square H1 = new Square(Position.H1);
            WrapperConfigSquare gH1 =  new WrapperConfigSquare(H1, vecinasH1);
            casillas.add(gH1);

            Map<Cardinality, Position>  vecinasA2 = new HashMap<>();

            vecinasA2.put(Cardinality.SOUTH, Position.A1);
            vecinasA2.put(Cardinality.SOUTHEAST, Position.B1);
            vecinasA2.put(Cardinality.EAST, Position.B2);
            vecinasA2.put(Cardinality.NORTHEAST, Position.B3);
            vecinasA2.put(Cardinality.NORTH, Position.A3);


            Square A2 = new Square(Position.A2);
            WrapperConfigSquare gA2 =  new WrapperConfigSquare(A2, vecinasA2);
            casillas.add(gA2);

            Map<Cardinality, Position>  vecinasB2 = new HashMap<>();

            vecinasB2.put(Cardinality.SOUTH, Position.B2);
            vecinasB2.put(Cardinality.SOUTHEAST, Position.C2);
            vecinasB2.put(Cardinality.EAST, Position.C3);
            vecinasB2.put(Cardinality.NORTHEAST, Position.C4);
            vecinasB2.put(Cardinality.NORTH, Position.B4);
            vecinasB2.put(Cardinality.NORTHWEST, Position.A4);
            vecinasB2.put(Cardinality.WEST, Position.A3);
            vecinasB2.put(Cardinality.SOUTHWEST, Position.A2);


            Square B2 = new Square(Position.B2);
            WrapperConfigSquare gB2 =  new WrapperConfigSquare(B2, vecinasB2);
            casillas.add(gB2);

            Map<Cardinality, Position>  vecinasC2 = new HashMap<>();

            vecinasC2.put(Cardinality.SOUTH, Position.C1);
            vecinasC2.put(Cardinality.SOUTHEAST, Position.D1);
            vecinasC2.put(Cardinality.EAST, Position.D2);
            vecinasC2.put(Cardinality.NORTHEAST, Position.D3);
            vecinasC2.put(Cardinality.NORTH, Position.C3);
            vecinasC2.put(Cardinality.NORTHWEST, Position.B3);
            vecinasC2.put(Cardinality.WEST, Position.B2);
            vecinasC2.put(Cardinality.SOUTHWEST, Position.B1);


            Square C2 = new Square(Position.C2);
            WrapperConfigSquare gC2 =  new WrapperConfigSquare(C2, vecinasC2);
            casillas.add(gC2);

            Map<Cardinality, Position>  vecinasD2 = new HashMap<>();

            vecinasD2.put(Cardinality.SOUTH, Position.D1);
            vecinasD2.put(Cardinality.SOUTHEAST, Position.E1);
            vecinasD2.put(Cardinality.EAST, Position.E2);
            vecinasD2.put(Cardinality.NORTHEAST, Position.E3);
            vecinasD2.put(Cardinality.NORTH, Position.D3);
            vecinasD2.put(Cardinality.NORTHWEST, Position.C3);
            vecinasD2.put(Cardinality.WEST, Position.C2);
            vecinasD2.put(Cardinality.SOUTHWEST, Position.C1);


            Square D2 = new Square(Position.D2);
            WrapperConfigSquare gD2 =  new WrapperConfigSquare(D2, vecinasD2);
            casillas.add(gD2);

            Map<Cardinality, Position>  vecinasE2 = new HashMap<>();

            vecinasE2.put(Cardinality.SOUTH, Position.E1);
            vecinasE2.put(Cardinality.SOUTHEAST, Position.F1);
            vecinasE2.put(Cardinality.EAST, Position.F2);
            vecinasE2.put(Cardinality.NORTHEAST, Position.F3);
            vecinasE2.put(Cardinality.NORTH, Position.E3);
            vecinasE2.put(Cardinality.NORTHWEST, Position.D3);
            vecinasE2.put(Cardinality.WEST, Position.D2);
            vecinasE2.put(Cardinality.SOUTHWEST, Position.D1);


            Square E2 = new Square(Position.E2);
            WrapperConfigSquare gE2 =  new WrapperConfigSquare(E2, vecinasE2);
            casillas.add(gE2);

            Map<Cardinality, Position>  vecinasF2 = new HashMap<>();

            vecinasF2.put(Cardinality.SOUTH, Position.F1);
            vecinasF2.put(Cardinality.SOUTHEAST, Position.G1);
            vecinasF2.put(Cardinality.EAST, Position.G2);
            vecinasF2.put(Cardinality.NORTHEAST, Position.G3);
            vecinasF2.put(Cardinality.NORTH, Position.F3);
            vecinasF2.put(Cardinality.NORTHWEST, Position.E3);
            vecinasF2.put(Cardinality.WEST, Position.E2);
            vecinasF2.put(Cardinality.SOUTHWEST, Position.E1);


            Square F2 = new Square(Position.F2);
            WrapperConfigSquare gF2 =  new WrapperConfigSquare(F2, vecinasF2);
            casillas.add(gF2);

            Map<Cardinality, Position>  vecinasG2 = new HashMap<>();

            vecinasG2.put(Cardinality.SOUTH, Position.G1);
            vecinasG2.put(Cardinality.SOUTHEAST, Position.H1);
            vecinasG2.put(Cardinality.EAST, Position.H2);
            vecinasG2.put(Cardinality.NORTHEAST, Position.H3);
            vecinasG2.put(Cardinality.NORTH, Position.G3);
            vecinasG2.put(Cardinality.NORTHWEST, Position.F3);
            vecinasG2.put(Cardinality.WEST, Position.F2);
            vecinasG2.put(Cardinality.SOUTHWEST, Position.F1);


            Square G2 = new Square(Position.G2);
            WrapperConfigSquare gG2 =  new WrapperConfigSquare(G2, vecinasG2);
            casillas.add(gG2);

            Map<Cardinality, Position>  vecinasH2 = new HashMap<>();

            vecinasH2.put(Cardinality.SOUTH, Position.H1);
            vecinasH2.put(Cardinality.NORTH, Position.H3);
            vecinasH2.put(Cardinality.NORTHWEST, Position.G3);
            vecinasH2.put(Cardinality.WEST, Position.G2);
            vecinasH2.put(Cardinality.SOUTHWEST, Position.G1);


            Square H2 = new Square(Position.H2);
            WrapperConfigSquare gH2 =  new WrapperConfigSquare(H2, vecinasH2);
            casillas.add(gH2);

            Map<Cardinality, Position>  vecinasA3 = new HashMap<>();
            vecinasA3.put(Cardinality.SOUTH, Position.A2);
            vecinasA3.put(Cardinality.SOUTHEAST, Position.B2);
            vecinasA3.put(Cardinality.EAST, Position.B3);
            vecinasA3.put(Cardinality.NORTHEAST, Position.B4);
            vecinasA3.put(Cardinality.NORTH, Position.A4);

            Square A3 = new Square(Position.A3);
            WrapperConfigSquare gA3 =  new WrapperConfigSquare(A3, vecinasA3);
            casillas.add(gA3);

            Map<Cardinality, Position>  vecinasB3 = new HashMap<>();
            vecinasB3.put(Cardinality.SOUTH, Position.B2);
            vecinasB3.put(Cardinality.SOUTHEAST, Position.C2);
            vecinasB3.put(Cardinality.EAST, Position.C3);
            vecinasB3.put(Cardinality.NORTHEAST, Position.C4);
            vecinasB3.put(Cardinality.NORTH, Position.B4);
            vecinasB3.put(Cardinality.NORTHWEST, Position.A4);
            vecinasB3.put(Cardinality.WEST, Position.A3);
            vecinasB3.put(Cardinality.SOUTHWEST, Position.A2);

            Square B3 = new Square(Position.B3);
            WrapperConfigSquare gB3 =  new WrapperConfigSquare(B3, vecinasB3);
            casillas.add(gB3);

            Map<Cardinality, Position>  vecinasC3 = new HashMap<>();
            vecinasC3.put(Cardinality.SOUTH, Position.C2);
            vecinasC3.put(Cardinality.SOUTHEAST, Position.D2);
            vecinasC3.put(Cardinality.EAST, Position.D3);
            vecinasC3.put(Cardinality.NORTHEAST, Position.D4);
            vecinasC3.put(Cardinality.NORTH, Position.C4);
            vecinasC3.put(Cardinality.NORTHWEST, Position.B4);
            vecinasC3.put(Cardinality.WEST, Position.B3);
            vecinasC3.put(Cardinality.SOUTHWEST, Position.B2);

            Square C3 = new Square(Position.C3);
            WrapperConfigSquare gC3 =  new WrapperConfigSquare(C3, vecinasC3);
            casillas.add(gC3);

            Map<Cardinality, Position>  vecinasD3 = new HashMap<>();
            vecinasD3.put(Cardinality.SOUTH, Position.D2);
            vecinasD3.put(Cardinality.SOUTHEAST, Position.E2);
            vecinasD3.put(Cardinality.EAST, Position.E3);
            vecinasD3.put(Cardinality.NORTHEAST, Position.E4);
            vecinasD3.put(Cardinality.NORTH, Position.D4);
            vecinasD3.put(Cardinality.NORTHWEST, Position.C4);
            vecinasD3.put(Cardinality.WEST, Position.C3);
            vecinasD3.put(Cardinality.SOUTHWEST, Position.C2);

            Square D3 = new Square(Position.D3);
            WrapperConfigSquare gD3 =  new WrapperConfigSquare(D3, vecinasD3);
            casillas.add(gD3);

            Map<Cardinality, Position>  vecinasE3 = new HashMap<>();
            vecinasE3.put(Cardinality.SOUTH, Position.E2);
            vecinasE3.put(Cardinality.SOUTHEAST, Position.F2);
            vecinasE3.put(Cardinality.EAST, Position.F3);
            vecinasE3.put(Cardinality.NORTHEAST, Position.F4);
            vecinasE3.put(Cardinality.NORTH, Position.E4);
            vecinasE3.put(Cardinality.NORTHWEST, Position.D4);
            vecinasE3.put(Cardinality.WEST, Position.D3);
            vecinasE3.put(Cardinality.SOUTHWEST, Position.D2);

            Square E3 = new Square(Position.E3);
            WrapperConfigSquare gE3 =  new WrapperConfigSquare(E3, vecinasD3);
            casillas.add(gE3);

            Map<Cardinality, Position>  vecinasF3 = new HashMap<>();
            vecinasF3.put(Cardinality.SOUTH, Position.F2);
            vecinasF3.put(Cardinality.SOUTHEAST, Position.G2);
            vecinasF3.put(Cardinality.EAST, Position.G3);
            vecinasF3.put(Cardinality.NORTHEAST, Position.G4);
            vecinasF3.put(Cardinality.NORTH, Position.F4);
            vecinasF3.put(Cardinality.NORTHWEST, Position.E4);
            vecinasF3.put(Cardinality.WEST, Position.E3);
            vecinasF3.put(Cardinality.SOUTHWEST, Position.E2);

            Square F3 = new Square(Position.F3);
            WrapperConfigSquare gF3 =  new WrapperConfigSquare(F3, vecinasF3);
            casillas.add(gF3);

            Map<Cardinality, Position>  vecinasG3 = new HashMap<>();
            vecinasG3.put(Cardinality.SOUTH, Position.G2);
            vecinasG3.put(Cardinality.SOUTHEAST, Position.H2);
            vecinasG3.put(Cardinality.EAST, Position.H3);
            vecinasG3.put(Cardinality.NORTHEAST, Position.H4);
            vecinasG3.put(Cardinality.NORTH, Position.G4);
            vecinasG3.put(Cardinality.NORTHWEST, Position.F4);
            vecinasG3.put(Cardinality.WEST, Position.F3);
            vecinasG3.put(Cardinality.SOUTHWEST, Position.F2);

            Square G3 = new Square(Position.G3);
            WrapperConfigSquare gG3 =  new WrapperConfigSquare(G3, vecinasG3);
            casillas.add(gG3);

            Map<Cardinality, Position>  vecinasH3 = new HashMap<>();
            vecinasH3.put(Cardinality.SOUTH, Position.H2);
            vecinasH3.put(Cardinality.NORTH, Position.H4);
            vecinasH3.put(Cardinality.NORTHWEST, Position.G4);
            vecinasH3.put(Cardinality.WEST, Position.G3);
            vecinasH3.put(Cardinality.SOUTHWEST, Position.G2);

            Square H3 = new Square(Position.H3);
            WrapperConfigSquare gH3 =  new WrapperConfigSquare(H3, vecinasH3);
            casillas.add(gH3);

            Map<Cardinality, Position>  vecinasA4 = new HashMap<>();

            vecinasA4.put(Cardinality.SOUTH, Position.A3);
            vecinasA4.put(Cardinality.SOUTHEAST, Position.B3);
            vecinasA4.put(Cardinality.EAST, Position.B4);
            vecinasA4.put(Cardinality.NORTHEAST, Position.B5);
            vecinasA4.put(Cardinality.NORTH, Position.A5);


            Square A4 = new Square(Position.A4);
            WrapperConfigSquare gA4 =  new WrapperConfigSquare(A4, vecinasA4);
            casillas.add(gA4);

            Map<Cardinality, Position>  vecinasB4 = new HashMap<>();

            vecinasB4.put(Cardinality.SOUTH, Position.B3);
            vecinasB4.put(Cardinality.SOUTHEAST, Position.C3);
            vecinasB4.put(Cardinality.EAST, Position.C4);
            vecinasB4.put(Cardinality.NORTHEAST, Position.C5);
            vecinasB4.put(Cardinality.NORTH, Position.B5);
            vecinasB4.put(Cardinality.NORTHWEST, Position.A5);
            vecinasB4.put(Cardinality.WEST, Position.A4);
            vecinasB4.put(Cardinality.SOUTHWEST, Position.A3);

            Square B4 = new Square(Position.B4);
            WrapperConfigSquare gB4 =  new WrapperConfigSquare(B4, vecinasB4);
            casillas.add(gB4);


            Map<Cardinality, Position>  vecinasC4 = new HashMap<>();

            vecinasC4.put(Cardinality.SOUTH, Position.C3);
            vecinasC4.put(Cardinality.SOUTHEAST, Position.D3);
            vecinasC4.put(Cardinality.EAST, Position.D4);
            vecinasC4.put(Cardinality.NORTHEAST, Position.D5);
            vecinasC4.put(Cardinality.NORTH, Position.C5);
            vecinasC4.put(Cardinality.NORTHWEST, Position.B5);
            vecinasC4.put(Cardinality.WEST, Position.B4);
            vecinasC4.put(Cardinality.SOUTHWEST, Position.B3);


            Square C4 = new Square(Position.C4);
            WrapperConfigSquare gC4 =  new WrapperConfigSquare(C4, vecinasC4);
            casillas.add(gC4);

            Map<Cardinality, Position>  vecinasD4 = new HashMap<>();

            vecinasD4.put(Cardinality.SOUTH, Position.D3);
            vecinasD4.put(Cardinality.SOUTHEAST, Position.E3);
            vecinasD4.put(Cardinality.EAST, Position.E4);
            vecinasD4.put(Cardinality.NORTHEAST, Position.E5);
            vecinasD4.put(Cardinality.NORTH, Position.D5);
            vecinasD4.put(Cardinality.NORTHWEST, Position.C5);
            vecinasD4.put(Cardinality.WEST, Position.C4);
            vecinasD4.put(Cardinality.SOUTHWEST, Position.C3);

            Square D4 = new Square(Position.D4);
            WrapperConfigSquare gD4 =  new WrapperConfigSquare(D4, vecinasD4);
            casillas.add(gD4);

            Map<Cardinality, Position>  vecinasE4 = new HashMap<>();

            vecinasE4.put(Cardinality.SOUTH, Position.E3);
            vecinasE4.put(Cardinality.SOUTHEAST, Position.F3);
            vecinasE4.put(Cardinality.EAST, Position.F4);
            vecinasE4.put(Cardinality.NORTHEAST, Position.F5);
            vecinasE4.put(Cardinality.NORTH, Position.E5);
            vecinasE4.put(Cardinality.NORTHWEST, Position.D5);
            vecinasE4.put(Cardinality.WEST, Position.D4);
            vecinasE4.put(Cardinality.SOUTHWEST, Position.D3);

            Square E4 = new Square(Position.E4);
            WrapperConfigSquare gE4 =  new WrapperConfigSquare(E4, vecinasE4);
            casillas.add(gE4);

            Map<Cardinality, Position>  vecinasF4 = new HashMap<>();

            vecinasF4.put(Cardinality.SOUTH, Position.F3);
            vecinasF4.put(Cardinality.SOUTHEAST, Position.G3);
            vecinasF4.put(Cardinality.EAST, Position.G4);
            vecinasF4.put(Cardinality.NORTHEAST, Position.G5);
            vecinasF4.put(Cardinality.NORTH, Position.F5);
            vecinasF4.put(Cardinality.NORTHWEST, Position.E5);
            vecinasF4.put(Cardinality.WEST, Position.E4);
            vecinasF4.put(Cardinality.SOUTHWEST, Position.E3);


            Square F4 = new Square(Position.F4);
            WrapperConfigSquare gF4 =  new WrapperConfigSquare(F4, vecinasF4);
            casillas.add(gF4);

            Map<Cardinality, Position>  vecinasG4 = new HashMap<>();

            vecinasG4.put(Cardinality.SOUTH, Position.G3);
            vecinasG4.put(Cardinality.SOUTHEAST, Position.H3);
            vecinasG4.put(Cardinality.EAST, Position.H4);
            vecinasG4.put(Cardinality.NORTHEAST, Position.H5);
            vecinasG4.put(Cardinality.NORTH, Position.G5);
            vecinasG4.put(Cardinality.NORTHWEST, Position.F5);
            vecinasG4.put(Cardinality.WEST, Position.F4);
            vecinasG4.put(Cardinality.SOUTHWEST, Position.F3);

            Square G4 = new Square(Position.G4);
            WrapperConfigSquare gG4 =  new WrapperConfigSquare(G4, vecinasG4);
            casillas.add(gG4);

            Map<Cardinality, Position>  vecinasH4 = new HashMap<>();

            vecinasH4.put(Cardinality.SOUTH, Position.H3);
            vecinasH4.put(Cardinality.NORTH, Position.H5);
            vecinasH4.put(Cardinality.NORTHWEST, Position.G5);
            vecinasH4.put(Cardinality.WEST, Position.G4);
            vecinasH4.put(Cardinality.SOUTHWEST, Position.G3);

            Square H4 = new Square(Position.H4);
            WrapperConfigSquare gH4 =  new WrapperConfigSquare(H4, vecinasH4);
            casillas.add(gH4);

            Map<Cardinality, Position>  vecinasA5 = new HashMap<>();
            vecinasA5.put(Cardinality.SOUTH, Position.A4);
            vecinasA5.put(Cardinality.SOUTHEAST, Position.B4);
            vecinasA5.put(Cardinality.EAST, Position.B5);
            vecinasA5.put(Cardinality.NORTHEAST, Position.B6);
            vecinasA5.put(Cardinality.NORTH, Position.A6);

            Square A5 = new Square(Position.A5);
            WrapperConfigSquare gA5 =  new WrapperConfigSquare(A5, vecinasA5);
            casillas.add(gA5);

            Map<Cardinality, Position>  vecinasB5 = new HashMap<>();
            vecinasB5.put(Cardinality.SOUTH, Position.B4);
            vecinasB5.put(Cardinality.SOUTHEAST, Position.C4);
            vecinasB5.put(Cardinality.EAST, Position.C5);
            vecinasB5.put(Cardinality.NORTHEAST, Position.C6);
            vecinasB5.put(Cardinality.NORTH, Position.B6);
            vecinasB5.put(Cardinality.NORTHWEST, Position.A6);
            vecinasB5.put(Cardinality.WEST, Position.A5);
            vecinasB5.put(Cardinality.SOUTHWEST, Position.A4);

            Square B5 = new Square(Position.B5);
            WrapperConfigSquare gB5 =  new WrapperConfigSquare(B5, vecinasB5);
            casillas.add(gB5);

            Map<Cardinality, Position>  vecinasC5 = new HashMap<>();
            vecinasC5.put(Cardinality.SOUTH, Position.C4);
            vecinasC5.put(Cardinality.SOUTHEAST, Position.D4);
            vecinasC5.put(Cardinality.EAST, Position.D5);
            vecinasC5.put(Cardinality.NORTHEAST, Position.D6);
            vecinasC5.put(Cardinality.NORTH, Position.C6);
            vecinasC5.put(Cardinality.NORTHWEST, Position.B6);
            vecinasC5.put(Cardinality.WEST, Position.B5);
            vecinasC5.put(Cardinality.SOUTHWEST, Position.B4);

            Square C5 = new Square(Position.C5);
            WrapperConfigSquare gC5 =  new WrapperConfigSquare(C5, vecinasC5);
            casillas.add(gC5);

            Map<Cardinality, Position>  vecinasD5 = new HashMap<>();
            vecinasD5.put(Cardinality.SOUTH, Position.D4);
            vecinasD5.put(Cardinality.SOUTHEAST, Position.E4);
            vecinasD5.put(Cardinality.EAST, Position.E5);
            vecinasD5.put(Cardinality.NORTHEAST, Position.E6);
            vecinasD5.put(Cardinality.NORTH, Position.D6);
            vecinasD5.put(Cardinality.NORTHWEST, Position.C6);
            vecinasD5.put(Cardinality.WEST, Position.C5);
            vecinasD5.put(Cardinality.SOUTHWEST, Position.C4);

            Square D5 = new Square(Position.D5);
            WrapperConfigSquare gD5 =  new WrapperConfigSquare(D5, vecinasD5);
            casillas.add(gD5);

            Map<Cardinality, Position>  vecinasE5 = new HashMap<>();
            vecinasE5.put(Cardinality.SOUTH, Position.E4);
            vecinasE5.put(Cardinality.SOUTHEAST, Position.F4);
            vecinasE5.put(Cardinality.EAST, Position.F5);
            vecinasE5.put(Cardinality.NORTHEAST, Position.F6);
            vecinasE5.put(Cardinality.NORTH, Position.E6);
            vecinasE5.put(Cardinality.NORTHWEST, Position.D6);
            vecinasE5.put(Cardinality.WEST, Position.D5);
            vecinasE5.put(Cardinality.SOUTHWEST, Position.D4);

            Square E5 = new Square(Position.E5);
            WrapperConfigSquare gE5 =  new WrapperConfigSquare(E5, vecinasE5);
            casillas.add(gE5);

            Map<Cardinality, Position>  vecinasF5 = new HashMap<>();
            vecinasF5.put(Cardinality.SOUTH, Position.F4);
            vecinasF5.put(Cardinality.SOUTHEAST, Position.G4);
            vecinasF5.put(Cardinality.EAST, Position.G5);
            vecinasF5.put(Cardinality.NORTHEAST, Position.G6);
            vecinasF5.put(Cardinality.NORTH, Position.F6);
            vecinasF5.put(Cardinality.NORTHWEST, Position.E6);
            vecinasF5.put(Cardinality.WEST, Position.E5);
            vecinasF5.put(Cardinality.SOUTHWEST, Position.E4);

            Square F5 = new Square(Position.F5);
            WrapperConfigSquare gF5 =  new WrapperConfigSquare(F5, vecinasF5);
            casillas.add(gF5);

            Map<Cardinality, Position>  vecinasG5 = new HashMap<>();
            vecinasG5.put(Cardinality.SOUTH, Position.G4);
            vecinasG5.put(Cardinality.SOUTHEAST, Position.H4);
            vecinasG5.put(Cardinality.EAST, Position.H5);
            vecinasG5.put(Cardinality.NORTHEAST, Position.H6);
            vecinasG5.put(Cardinality.NORTH, Position.G6);
            vecinasG5.put(Cardinality.NORTHWEST, Position.F6);
            vecinasG5.put(Cardinality.WEST, Position.F5);
            vecinasG5.put(Cardinality.SOUTHWEST, Position.F4);

            Square G5 = new Square(Position.G5);
            WrapperConfigSquare gG5 =  new WrapperConfigSquare(G5, vecinasG5);
            casillas.add(gG5);

            Map<Cardinality, Position>  vecinasH5 = new HashMap<>();
            vecinasH5.put(Cardinality.SOUTH, Position.H4);
            vecinasH5.put(Cardinality.NORTH, Position.H6);
            vecinasH5.put(Cardinality.NORTHWEST, Position.G6);
            vecinasH5.put(Cardinality.WEST, Position.G5);
            vecinasH5.put(Cardinality.SOUTHWEST, Position.G4);

            Square H5 = new Square(Position.H5);
            WrapperConfigSquare gH5 =  new WrapperConfigSquare(H5, vecinasH5);
            casillas.add(gH5);

            Map<Cardinality, Position>  vecinasA6 = new HashMap<>();

            vecinasA6.put(Cardinality.SOUTH, Position.A5);
            vecinasA6.put(Cardinality.SOUTHEAST, Position.B5);
            vecinasA6.put(Cardinality.EAST, Position.B6);
            vecinasA6.put(Cardinality.NORTHEAST, Position.B7);
            vecinasA6.put(Cardinality.NORTH, Position.A7);


            Square A6 = new Square(Position.A6);
            WrapperConfigSquare gA6 =  new WrapperConfigSquare(A6, vecinasA6);
            casillas.add(gA6);

            Map<Cardinality, Position>  vecinasB6 = new HashMap<>();

            vecinasB6.put(Cardinality.SOUTH, Position.B5);
            vecinasB6.put(Cardinality.SOUTHEAST, Position.C5);
            vecinasB6.put(Cardinality.EAST, Position.C6);
            vecinasB6.put(Cardinality.NORTHEAST, Position.C7);
            vecinasB6.put(Cardinality.NORTH, Position.B7);
            vecinasB6.put(Cardinality.NORTHWEST, Position.A7);
            vecinasB6.put(Cardinality.WEST, Position.A6);
            vecinasB6.put(Cardinality.SOUTHWEST, Position.A5);

            Square B6 = new Square(Position.B6);
            WrapperConfigSquare gB6 =  new WrapperConfigSquare(B6, vecinasB6);
            casillas.add(gB6);

            Map<Cardinality, Position>  vecinasC6 = new HashMap<>();

            vecinasC6.put(Cardinality.SOUTH, Position.C5);
            vecinasC6.put(Cardinality.SOUTHEAST, Position.D5);
            vecinasC6.put(Cardinality.EAST, Position.D6);
            vecinasC6.put(Cardinality.NORTHEAST, Position.D7);
            vecinasC6.put(Cardinality.NORTH, Position.C7);
            vecinasC6.put(Cardinality.NORTHWEST, Position.B7);
            vecinasC6.put(Cardinality.WEST, Position.B6);
            vecinasC6.put(Cardinality.SOUTHWEST, Position.B5);

            Square C6 = new Square(Position.C6);
            WrapperConfigSquare gC6 =  new WrapperConfigSquare(C6, vecinasC6);
            casillas.add(gC6);

            Map<Cardinality, Position>  vecinasD6 = new HashMap<>();

            vecinasD6.put(Cardinality.SOUTH, Position.D5);
            vecinasD6.put(Cardinality.SOUTHEAST, Position.E5);
            vecinasD6.put(Cardinality.EAST, Position.E6);
            vecinasD6.put(Cardinality.NORTHEAST, Position.E7);
            vecinasD6.put(Cardinality.NORTH, Position.D7);
            vecinasD6.put(Cardinality.NORTHWEST, Position.C7);
            vecinasD6.put(Cardinality.WEST, Position.C6);
            vecinasD6.put(Cardinality.SOUTHWEST, Position.C5);

            Square D6 = new Square(Position.D6);
            WrapperConfigSquare gD6 =  new WrapperConfigSquare(D6, vecinasD6);
            casillas.add(gD6);

            Map<Cardinality, Position>  vecinasE6 = new HashMap<>();

            vecinasE6.put(Cardinality.SOUTH, Position.E5);
            vecinasE6.put(Cardinality.SOUTHEAST, Position.F5);
            vecinasE6.put(Cardinality.EAST, Position.F6);
            vecinasE6.put(Cardinality.NORTHEAST, Position.F7);
            vecinasE6.put(Cardinality.NORTH, Position.E7);
            vecinasE6.put(Cardinality.NORTHWEST, Position.D7);
            vecinasE6.put(Cardinality.WEST, Position.D6);
            vecinasE6.put(Cardinality.SOUTHWEST, Position.D5);

            Square E6 = new Square(Position.E6);
            WrapperConfigSquare gE6 =  new WrapperConfigSquare(E6, vecinasE6);
            casillas.add(gE6);

            Map<Cardinality, Position>  vecinasF6 = new HashMap<>();

            vecinasF6.put(Cardinality.SOUTH, Position.F5);
            vecinasF6.put(Cardinality.SOUTHEAST, Position.G5);
            vecinasF6.put(Cardinality.EAST, Position.G6);
            vecinasF6.put(Cardinality.NORTHEAST, Position.G7);
            vecinasF6.put(Cardinality.NORTH, Position.F7);
            vecinasF6.put(Cardinality.NORTHWEST, Position.E7);
            vecinasF6.put(Cardinality.WEST, Position.E6);
            vecinasF6.put(Cardinality.SOUTHWEST, Position.E5);

            Square F6 = new Square(Position.F6);
            WrapperConfigSquare gF6 =  new WrapperConfigSquare(F6, vecinasF6);
            casillas.add(gF6);

            Map<Cardinality, Position>  vecinasG6 = new HashMap<>();

            vecinasG6.put(Cardinality.SOUTH, Position.G5);
            vecinasG6.put(Cardinality.SOUTHEAST, Position.H5);
            vecinasG6.put(Cardinality.EAST, Position.H6);
            vecinasG6.put(Cardinality.NORTHEAST, Position.H7);
            vecinasG6.put(Cardinality.NORTH, Position.G7);
            vecinasG6.put(Cardinality.NORTHWEST, Position.F7);
            vecinasG6.put(Cardinality.WEST, Position.F6);
            vecinasG6.put(Cardinality.SOUTHWEST, Position.F5);

            Square G6 = new Square(Position.G6);
            WrapperConfigSquare gG6 =  new WrapperConfigSquare(G6, vecinasG6);
            casillas.add(gG6);

            Map<Cardinality, Position>  vecinasH6 = new HashMap<>();

            vecinasH6.put(Cardinality.SOUTH, Position.H5);
            vecinasH6.put(Cardinality.NORTH, Position.H7);
            vecinasH6.put(Cardinality.NORTHWEST, Position.G7);
            vecinasH6.put(Cardinality.WEST, Position.G6);
            vecinasH6.put(Cardinality.SOUTHWEST, Position.G5);

            Square H6 = new Square(Position.H6);
            WrapperConfigSquare gH6 =  new WrapperConfigSquare(H6, vecinasH6);
            casillas.add(gH6);

            Map<Cardinality, Position>  vecinasA7 = new HashMap<>();
            vecinasA7.put(Cardinality.SOUTH, Position.A5);
            vecinasA7.put(Cardinality.SOUTHEAST, Position.B5);
            vecinasA7.put(Cardinality.EAST, Position.B6);
            vecinasA7.put(Cardinality.NORTHEAST, Position.B7);
            vecinasA7.put(Cardinality.NORTH, Position.A7);

            Square A7 = new Square(Position.A7);
            WrapperConfigSquare gA7 =  new WrapperConfigSquare(A7, vecinasA7);
            casillas.add(gA7);

            Map<Cardinality, Position>  vecinasB7 = new HashMap<>();
            vecinasB7.put(Cardinality.SOUTH, Position.B6);
            vecinasB7.put(Cardinality.SOUTHEAST, Position.C6);
            vecinasB7.put(Cardinality.EAST, Position.C7);
            vecinasB7.put(Cardinality.NORTHEAST, Position.C8);
            vecinasB7.put(Cardinality.NORTH, Position.B8);
            vecinasB7.put(Cardinality.NORTHWEST, Position.A8);
            vecinasB7.put(Cardinality.WEST, Position.A7);
            vecinasB7.put(Cardinality.SOUTHWEST, Position.A6);

            Square B7 = new Square(Position.B7);
            WrapperConfigSquare gB7 =  new WrapperConfigSquare(B7, vecinasB7);
            casillas.add(gB7);

            Map<Cardinality, Position>  vecinasC7 = new HashMap<>();
            vecinasC7.put(Cardinality.SOUTH, Position.C6);
            vecinasC7.put(Cardinality.SOUTHEAST, Position.D6);
            vecinasC7.put(Cardinality.EAST, Position.D7);
            vecinasC7.put(Cardinality.NORTHEAST, Position.D8);
            vecinasC7.put(Cardinality.NORTH, Position.C8);
            vecinasC7.put(Cardinality.NORTHWEST, Position.B8);
            vecinasC7.put(Cardinality.WEST, Position.B7);
            vecinasC7.put(Cardinality.SOUTHWEST, Position.B6);

            Square C7 = new Square(Position.C7);
            WrapperConfigSquare gC7 =  new WrapperConfigSquare(C7, vecinasC7);
            casillas.add(gC7);

            Map<Cardinality, Position>  vecinasD7 = new HashMap<>();
            vecinasD7.put(Cardinality.SOUTH, Position.D6);
            vecinasD7.put(Cardinality.SOUTHEAST, Position.E6);
            vecinasD7.put(Cardinality.EAST, Position.E7);
            vecinasD7.put(Cardinality.NORTHEAST, Position.E8);
            vecinasD7.put(Cardinality.NORTH, Position.D8);
            vecinasD7.put(Cardinality.NORTHWEST, Position.C8);
            vecinasD7.put(Cardinality.WEST, Position.C7);
            vecinasD7.put(Cardinality.SOUTHWEST, Position.C6);

            Square D7 = new Square(Position.D7);
            WrapperConfigSquare gD7 =  new WrapperConfigSquare(D7, vecinasD7);
            casillas.add(gD7);

            Map<Cardinality, Position>  vecinasE7 = new HashMap<>();
            vecinasE7.put(Cardinality.SOUTH, Position.E6);
            vecinasE7.put(Cardinality.SOUTHEAST, Position.F6);
            vecinasE7.put(Cardinality.EAST, Position.F7);
            vecinasE7.put(Cardinality.NORTHEAST, Position.F8);
            vecinasE7.put(Cardinality.NORTH, Position.E8);
            vecinasE7.put(Cardinality.NORTHWEST, Position.D8);
            vecinasE7.put(Cardinality.WEST, Position.D7);
            vecinasE7.put(Cardinality.SOUTHWEST, Position.D6);

            Square E7 = new Square(Position.E7);
            WrapperConfigSquare gE7 =  new WrapperConfigSquare(E7, vecinasE7);
            casillas.add(gE7);

            Map<Cardinality, Position>  vecinasF7 = new HashMap<>();
            vecinasF7.put(Cardinality.SOUTH, Position.F6);
            vecinasF7.put(Cardinality.SOUTHEAST, Position.G6);
            vecinasF7.put(Cardinality.EAST, Position.G7);
            vecinasF7.put(Cardinality.NORTHEAST, Position.G8);
            vecinasF7.put(Cardinality.NORTH, Position.F8);
            vecinasF7.put(Cardinality.NORTHWEST, Position.E8);
            vecinasF7.put(Cardinality.WEST, Position.E7);
            vecinasF7.put(Cardinality.SOUTHWEST, Position.E6);

            Square F7 = new Square(Position.F7);
            WrapperConfigSquare gF7 =  new WrapperConfigSquare(F7, vecinasF7);
            casillas.add(gF7);

            Map<Cardinality, Position>  vecinasG7 = new HashMap<>();
            vecinasG7.put(Cardinality.SOUTH, Position.G6);
            vecinasG7.put(Cardinality.SOUTHEAST, Position.H6);
            vecinasG7.put(Cardinality.EAST, Position.H7);
            vecinasG7.put(Cardinality.NORTHEAST, Position.H8);
            vecinasG7.put(Cardinality.NORTH, Position.G8);
            vecinasG7.put(Cardinality.NORTHWEST, Position.F8);
            vecinasG7.put(Cardinality.WEST, Position.F7);
            vecinasG7.put(Cardinality.SOUTHWEST, Position.F6);

            Square G7 = new Square(Position.G7);
            WrapperConfigSquare gG7 =  new WrapperConfigSquare(G7, vecinasG7);
            casillas.add(gG7);

            Map<Cardinality, Position>  vecinasH7 = new HashMap<>();
            vecinasH7.put(Cardinality.SOUTH, Position.H6);
            vecinasH7.put(Cardinality.NORTH, Position.H8);
            vecinasH7.put(Cardinality.NORTHWEST, Position.G8);
            vecinasH7.put(Cardinality.WEST, Position.G7);
            vecinasH7.put(Cardinality.SOUTHWEST, Position.G6);

            Square H7 = new Square(Position.H7);
            WrapperConfigSquare gH7 =  new WrapperConfigSquare(H7, vecinasH7);
            casillas.add(gH7);

            Map<Cardinality, Position>  vecinasA8 = new HashMap<>();
            vecinasA8.put(Cardinality.EAST, Position.B8);
            vecinasA8.put(Cardinality.SOUTH, Position.A7);
            vecinasA8.put(Cardinality.SOUTHWEST, Position.B7);

            Square A8 = new Square(Position.A8);
            WrapperConfigSquare gA8 =  new WrapperConfigSquare(A8, vecinasA8);
            casillas.add(gA8);

            Map<Cardinality, Position>  vecinasB8 = new HashMap<>();
            vecinasB8.put(Cardinality.EAST, Position.C8);
            vecinasB8.put(Cardinality.WEST, Position.A8);
            vecinasB8.put(Cardinality.SOUTHWEST, Position.A7);
            vecinasB8.put(Cardinality.SOUTH, Position.B7);
            vecinasB8.put(Cardinality.SOUTHEAST, Position.C7);

            Square B8 = new Square(Position.B8);
            WrapperConfigSquare gB8 =  new WrapperConfigSquare(B8, vecinasB8);
            casillas.add(gB8);

            Map<Cardinality, Position>  vecinasC8 = new HashMap<>();
            vecinasC8.put(Cardinality.EAST, Position.D8);
            vecinasC8.put(Cardinality.WEST, Position.B8);
            vecinasC8.put(Cardinality.SOUTHWEST, Position.B7);
            vecinasC8.put(Cardinality.SOUTH, Position.C7);
            vecinasC8.put(Cardinality.SOUTHEAST, Position.D7);

            Square C8 = new Square(Position.C8);
            WrapperConfigSquare gC8 =  new WrapperConfigSquare(C8, vecinasC8);
            casillas.add(gC8);

            Map<Cardinality, Position>  vecinasD8 = new HashMap<>();
            vecinasD8.put(Cardinality.EAST, Position.E8);
            vecinasD8.put(Cardinality.WEST, Position.C8);
            vecinasD8.put(Cardinality.SOUTHWEST, Position.C7);
            vecinasD8.put(Cardinality.SOUTH, Position.D7);
            vecinasD8.put(Cardinality.SOUTHEAST, Position.E7);

            Square D8 = new Square(Position.D8);
            WrapperConfigSquare gD8 =  new WrapperConfigSquare(D8, vecinasD8);
            casillas.add(gD8);

            Map<Cardinality, Position>  vecinasE8 = new HashMap<>();
            vecinasE8.put(Cardinality.EAST, Position.D8);
            vecinasE8.put(Cardinality.WEST, Position.D8);
            vecinasE8.put(Cardinality.SOUTHWEST, Position.E7);
            vecinasE8.put(Cardinality.SOUTH, Position.F7);
            vecinasE8.put(Cardinality.SOUTHEAST, Position.F7);

            Square E8 = new Square(Position.E8);
            WrapperConfigSquare gE8 =  new WrapperConfigSquare(E8, vecinasE8);
            casillas.add(gE8);

            Map<Cardinality, Position>  vecinasF8 = new HashMap<>();
            vecinasF8.put(Cardinality.EAST, Position.E8);
            vecinasF8.put(Cardinality.WEST, Position.E8);
            vecinasF8.put(Cardinality.SOUTHWEST, Position.F7);
            vecinasF8.put(Cardinality.SOUTH, Position.G7);
            vecinasF8.put(Cardinality.SOUTHEAST, Position.G7);

            Square F8 = new Square(Position.F8);
            WrapperConfigSquare gF8 =  new WrapperConfigSquare(F8, vecinasF8);
            casillas.add(gF8);

            Map<Cardinality, Position>  vecinasG8 = new HashMap<>();
            vecinasG8.put(Cardinality.EAST, Position.F8);
            vecinasG8.put(Cardinality.WEST, Position.F8);
            vecinasG8.put(Cardinality.SOUTHWEST, Position.G7);
            vecinasG8.put(Cardinality.SOUTH, Position.H7);
            vecinasG8.put(Cardinality.SOUTHEAST, Position.H7);

            Square G8 = new Square(Position.G8);
            WrapperConfigSquare gG8 =  new WrapperConfigSquare(G8, vecinasG8);
            casillas.add(gG8);

            Map<Cardinality, Position>  vecinasH8 = new HashMap<>();
            vecinasH7.put(Cardinality.WEST, Position.G8);
            vecinasH7.put(Cardinality.SOUTHWEST, Position.G7);
            vecinasH7.put(Cardinality.SOUTH, Position.H7);

            Square H8 = new Square(Position.H8);
            WrapperConfigSquare gH8 =  new WrapperConfigSquare(H8, vecinasH8);
            casillas.add(gH8);

            return casillas;

        }

        public void agregarPosicionVecina(Square principal, Position vecina, Cardinality Cardinality) {
            principal.addNeighbourPosition(Cardinality, vecina);
        }

        private void asociarPrincipalConVecinas(Square main, Map<Cardinality, Position> neighbours) {

            Square neighbour = null;

            if(neighbours.get(Cardinality.EAST) != null){
                Position position = neighbours.get(Cardinality.EAST);
                agregarPosicionVecina(main, position, Cardinality.EAST);
            }
            if(neighbours.get(Cardinality.WEST) != null){
                Position position = neighbours.get(Cardinality.WEST);
                agregarPosicionVecina(main, position, Cardinality.WEST);
            }
            if(neighbours.get(Cardinality.NORTH) != null){
                Position position = neighbours.get(Cardinality.NORTH);
                agregarPosicionVecina(main, position, Cardinality.NORTH);
            }
            if(neighbours.get(Cardinality.SOUTH) != null){
                Position position = neighbours.get(Cardinality.SOUTH);
                agregarPosicionVecina(main, position, Cardinality.SOUTH);
            }
            if(neighbours.get(Cardinality.NORTHEAST) != null){
                Position position = neighbours.get(Cardinality.NORTHEAST);
                agregarPosicionVecina(main, position, Cardinality.NORTHEAST);
            }
            if(neighbours.get(Cardinality.NORTHWEST) != null){
                Position position = neighbours.get(Cardinality.NORTHWEST);
                agregarPosicionVecina(main, position, Cardinality.NORTHWEST);
            }
            if(neighbours.get(Cardinality.SOUTHEAST) != null){
                Position position = neighbours.get(Cardinality.SOUTHEAST);
                agregarPosicionVecina(main, position, Cardinality.SOUTHEAST);
            }
            if(neighbours.get(Cardinality.SOUTHWEST) != null){
                Position position = neighbours.get(Cardinality.SOUTHWEST);
                agregarPosicionVecina(main, position, Cardinality.SOUTHWEST);
            }
        }

    }

