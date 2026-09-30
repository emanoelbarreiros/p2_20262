package br.upe.gui;

import javax.swing.*;

public class TesteJOP {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Digite o numero 1: ");
        String numero2 = JOptionPane.showInputDialog("Digite o numero 2: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma é " + soma,
                "Soma de dois inteiros", JOptionPane.WARNING_MESSAGE);
    }
}
