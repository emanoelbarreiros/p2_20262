package br.upe.prova;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() + 500;
    }

}
