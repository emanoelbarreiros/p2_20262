package br.upe;

import java.util.Scanner;

public class LivroNotas {

    private String curso;

    public LivroNotas(String curso) {
        this.curso = curso;
    }

    public void exibirBoasVindas() {
        System.out.println("Bem-vindo ao livro de notas do curso " + curso + "!");
    }

    public void determinarMediaTurma() {
        Scanner scan = new Scanner(System.in);

        double acumulador = 0;
        int qtdNotasVermelhas = 0;
        double nota = 0;

        int contador = 0;
        while (contador < 10) {
            System.out.print("Informe a nota " + (contador + 1) + ": ");
            nota = scan.nextDouble();
            acumulador += nota;

            if (nota < 7.0) {
                qtdNotasVermelhas += 1;
            }

            contador += 1;
        }

        double media = acumulador / 10;
        System.out.printf("Média da turma: %.2f%n", media);
        System.out.printf("Notas abaixo de 7.0: %d", qtdNotasVermelhas);
    }

    public void setCurso(String nomeCurso) {
        curso = nomeCurso;
    }

    public String getCurso() {
        return curso;
    }

}
