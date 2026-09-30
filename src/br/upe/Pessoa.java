package br.upe;

public class Pessoa extends Object {

    protected String nome;

    public Pessoa() { }

    public Pessoa(String nomePessoa) {
        nome = nomePessoa;
    }

    public void exibirNome() {
        System.out.println(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
