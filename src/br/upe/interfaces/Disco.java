package br.upe.interfaces;

public class Disco implements Comparable<Disco> {

    private int anoLancamento;
    private String banda;
    private String titulo;

    public Disco(int anoLancamento, String banda, String titulo) {
        this.anoLancamento = anoLancamento;
        this.banda = banda;
        this.titulo = titulo;
    }


    @Override
    public int compareTo(Disco outro) {
        return this.titulo.compareTo(outro.getTitulo());
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getBanda() {
        return banda;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return String.format("%s - %s (%d)", titulo.toUpperCase(), banda, anoLancamento);
    }
}
