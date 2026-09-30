package br.upe.excecoes;

public class TesteException2 {
    public static void main(String[] args) {
        try {
            throw new ExcecaoC();
        } catch (ExcecaoA e) {
            System.out.println("Excecao Capturada");
        }
    }
}
