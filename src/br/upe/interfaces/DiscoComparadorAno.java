package br.upe.interfaces;

import java.util.Comparator;

public class DiscoComparadorAno implements Comparator<Disco> {
    @Override
    public int compare(Disco o1, Disco o2) {
        return o1.getAnoLancamento() - o2.getAnoLancamento();
    }
}
