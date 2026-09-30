package br.upe;

import java.util.Scanner;

public class LivroNotasTeste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do curso: ");
        String nomeCurso = scan.nextLine();

        LivroNotas livro = new LivroNotas(nomeCurso);
        livro.determinarMediaTurma();
    }
}
