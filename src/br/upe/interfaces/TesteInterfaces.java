package br.upe.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class TesteInterfaces {
    public static void main(String[] args) {
        ArrayList<Disco> lista = new ArrayList<Disco>();

        lista.add(new Disco(1974, "King Crimson", "Red"));
        lista.add(new Disco(1991, "Nirvana", "Nevermind"));
        lista.add(new Disco(1970, "Black Sabbath", "Paranoid"));

        Collections.sort(lista, new DiscoComparadorAno());

        for (Disco d : lista) {
            System.out.println(d);
        }
    }
}
