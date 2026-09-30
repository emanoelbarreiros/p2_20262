package br.upe.poli;

public class Passaro extends Animal {

    @Override
    public void mover() throws RuntimeException {
        System.out.println("O pássaro voou 5 metros.");
        throw new RuntimeException();
    }
}
