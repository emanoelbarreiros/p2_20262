package br.upe.prova;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String toString() {
        return nome + " " + calcularSalario();
    }
}
