package br.com.brcoutinho;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayLists", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 21));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        List<Aula> aulas =  javaColecoes.getAulas();
        System.out.println(aulas);
    }
}
