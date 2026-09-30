package br.upe.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExcecao {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a / b;
            if (c % 2 != 0) {
                throw new NovaException("Não gosto de numeros impares");
            }
            System.out.println(c);
        } catch(InputMismatchException e) {
            System.out.println("Aconteceu alguma excecao: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir por zero. " + e.getMessage());
        }
        System.out.println("O programa finalizou normalmente.");

    }
}
