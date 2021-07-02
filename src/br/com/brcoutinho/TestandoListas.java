package br.com.brcoutinho;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Collections";
        String aula2 = "Listas";
        String aula3 = "Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for(String aula : aulas){
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aulas: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula);
        });

        aulas.add("Lambda");

        Collections.sort(aulas);

        aulas.forEach(aulaOrdenada -> {
            System.out.println("Aula ordenada: " + aulaOrdenada);
        });
    }
}
