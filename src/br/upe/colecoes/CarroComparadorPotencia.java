package br.upe.colecoes;

import java.util.Comparator;

public class CarroComparadorPotencia implements Comparator<Carro> {

    public int compare(Carro o1, Carro o2) {
        return o1.getPotencia() - o2.getPotencia();
    }
}
