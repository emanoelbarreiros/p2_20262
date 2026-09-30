package br.upe.poli;

import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Peixe();
        animais[2] = new Passaro();

        try {
            for (Animal ani : animais) {
                ani.mover();
            }
        } catch(RuntimeException  e) {
            System.out.println("aconteceu uma excecao");
        }
    }
}
