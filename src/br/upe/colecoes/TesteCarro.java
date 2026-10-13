package br.upe.colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro(2000, "civic");
        Carro c2 = new Carro(1000, "uno");
        Carro c3 = new Carro(1500, "fit");

        ArrayList<Carro> carros = new ArrayList<>();

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        for (Carro c : carros) {
            System.out.println(c);
        }

        Collections.sort(carros, new CarroComparadorPotencia());

        System.out.println();
        for (Carro c : carros) {
            System.out.println(c);
        }

        Collections.sort(carros, new CarroComparadorModelo());

        System.out.println();
        for (Carro c : carros) {
            System.out.println(c);
        }
    }
}
