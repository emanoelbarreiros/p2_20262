package br.upe;

public class ExemploSwitch {

    public static void main(String[] args) {
        int dia = 6;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia de semana");
                break;
            case 6:
            case 7:
                System.out.println("Fim de semana");
                break;
        }

    }
}
