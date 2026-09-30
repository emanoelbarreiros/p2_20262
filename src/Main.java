import java.util.Scanner;
import br.upe.LivroNotas;
import br.upe.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Emanoel");
        Pessoa p2 = new Pessoa("Emanoel");

        LivroNotas livro = new LivroNotas("Java");

        //p2.nome = "Joao";

        if (p1.equals(p2)) {
            System.out.println("Objetos iguais");
        } else {
            System.out.println("Objetos diferentes");
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}