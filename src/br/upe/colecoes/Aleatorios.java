package br.upe.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Aleatorios {

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            numeros.add(rand.nextInt(0, 11));
        }

        int[] contagem = new int[11];
        for (int i = 0; i < contagem.length; i++) {
            contagem[i] = Collections.frequency(numeros, i);
        }

        for (int i = 0; i < contagem.length; i++) {
            System.out.printf("Quantidade de valores %d: %d (%.2f%%)%n", i, contagem[i], 100 * contagem[i]/100_000.0);
        }
    }
}
