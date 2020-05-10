package com.ar.ajedrez.Constantes;

import com.ar.ajedrez.*;

import java.util.Arrays;
import java.util.List;

public class PosicionesPiezas {

    public static List<Ficha> PIEZAS_BLANCAS = Arrays.asList(
            new Torre(Color.BLANCO),
            new Caballo(Color.BLANCO),
            new Alfil(Color.BLANCO),
            new Reina(Color.BLANCO),
            new Rey(Color.BLANCO),
            new Alfil(Color.BLANCO),
            new Caballo(Color.BLANCO),
            new Torre(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO),
            new Peon(Color.BLANCO)
    );

    public static List<Ficha> PIEZAS_NEGRAS = Arrays.asList(
            new Torre(Color.NEGRO),
            new Caballo(Color.NEGRO),
            new Alfil(Color.NEGRO),
            new Reina(Color.NEGRO),
            new Rey(Color.NEGRO),
            new Alfil(Color.NEGRO),
            new Caballo(Color.NEGRO),
            new Torre(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO),
            new Peon(Color.NEGRO)
    );


    public static List<Posicion> BLANCAS = Arrays.asList(
            Posicion.A1,
            Posicion.B1,
            Posicion.C1,
            Posicion.D1,
            Posicion.E1,
            Posicion.F1,
            Posicion.G1,
            Posicion.H1,
            Posicion.A2,
            Posicion.B2,
            Posicion.C2,
            Posicion.D2,
            Posicion.E2,
            Posicion.F2,
            Posicion.G2,
            Posicion.H2);

    public static List<Posicion> NEGRAS = Arrays.asList(
            Posicion.A8,
            Posicion.B8,
            Posicion.C8,
            Posicion.D8,
            Posicion.E8,
            Posicion.F8,
            Posicion.G8,
            Posicion.H8,
            Posicion.A7,
            Posicion.B7,
            Posicion.C7,
            Posicion.D7,
            Posicion.E7,
            Posicion.F7,
            Posicion.G7,
            Posicion.H7);
}
