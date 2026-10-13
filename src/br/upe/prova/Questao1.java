package br.upe.prova;

public class Questao1 {
    public static boolean validarCpf(String cpf) {
        if (cpf.length() != 14) {
            return false;
        }

        if (cpf.charAt(3) != '.'
                || cpf.charAt(7) != '.'
                || cpf.charAt(11) != '-') {
            return false;
        }

        String cpfLimpo = cpf.replace(".","").replace("-","");
        for (int i = 0; i < cpfLimpo.length(); i++) {
            if (!Character.isDigit(cpfLimpo.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String cpfValido = "111.111.111-11";
        String cpfInvalido1 = "111+111.111-11";
        String cpfInvalido2 = "111.111+111-11";
        String cpfInvalido3 = "111.111.111+11";
        String cpfInvalido4 = "111.111.111-X1";

        String[] cpfs = {cpfValido, cpfInvalido1, cpfInvalido2, cpfInvalido3, cpfInvalido4};

        for (String cpf : cpfs) {
            System.out.println(validarCpf(cpf));
        }
    }

}
