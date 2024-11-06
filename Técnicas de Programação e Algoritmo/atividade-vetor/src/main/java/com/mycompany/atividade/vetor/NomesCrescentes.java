package com.mycompany.atividade.vetor;

import java.util.Arrays;

public class NomesCrescentes {

    public static void main(String[] args) {
        String[] nomes = {"Lucas", "Ana", "Carlos", "Beatriz", "Fernando", "João", "Mariana", "Pedro", "Gustavo", "Laura", "Rafael", "Bruna", "Thiago", "Alice", "Ricardo"};

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
