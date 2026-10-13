package br.upe.colecoes;

import java.util.Comparator;

public class CarroComparadorModelo implements Comparator<Carro> {

    public int compare(Carro c1, Carro c2) {
        return c1.getModelo().compareTo(c2.getModelo());
    }
}
