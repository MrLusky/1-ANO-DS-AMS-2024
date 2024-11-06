package com.mycompany.atividade.array;

import java.util.Arrays;
import java.util.Collections;


public class NomesDecrescentes {

    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Ana", "Carlos", "Beatriz", "Fernando", "João", "Mariana", "Pedro", "Gustavo", "Laura",
                          "Rafael", "Bruna", "Thiago", "Alice", "Ricardo", "Paula", "Marcelo", "Camila", "André", "Sofia"};

        Arrays.sort(nomes, Collections.reverseOrder());

        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
