package br.upe.colecoes;

public class Carro {

    private int potencia;
    private String modelo;

    public Carro(int potencia, String modelo) {
        this.potencia = potencia;
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + " (" + potencia + ")";
    }
}
