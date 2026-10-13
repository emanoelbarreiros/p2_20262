package br.upe.prova;

public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() * 0.89;
    }
}
