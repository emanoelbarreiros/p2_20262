package br.upe;

public class PassagemValor {

    public static void main(String[] args) {
//        int variavel = 10;
//        metodo1(variavel);
//        System.out.println("main: " + variavel);

//        Pessoa p1 = new Pessoa("Carlos");
//        metodo2(p1);
//        System.out.println(p1.getNome());

        double media1 = media(3.0, 4.0, 10.0, 2.5, 5.0);
        System.out.println(media1);
    }

    public static double media(double... notas) {
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        return total / notas.length;
    }

    public static void metodo2(Pessoa p) {
        System.out.println(p.getNome());

        p = new Pessoa("João");
    }

    public static void metodo1(int valor) {
        System.out.println("metodo1: " + valor);
        valor++;
        System.out.println("metodo1: " + valor);
    }

}
