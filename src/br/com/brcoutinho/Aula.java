package br.com.brcoutinho;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private Integer tempo;

    public String getTitulo() {
        return titulo;
    }

    public Integer getTempo() {
        return tempo;
    }

    public Aula(String titulo, Integer tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
