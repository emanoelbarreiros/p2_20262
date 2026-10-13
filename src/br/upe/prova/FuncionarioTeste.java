package br.upe.prova;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new FuncionarioCLT("Emanoel", 1000);
        funcionarios[1] = new FuncionarioPJ("José", 1000);

        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }
}
