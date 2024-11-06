package com.mycompany.atividade.array;

import java.util.Arrays;

public class NumerosCrescentes {

    public static void main(String[] args) {
        int[] numeros = {50, 23, 17, 34, 2, 67, 89, 12, 45, 98, 32, 4, 27, 43, 5, 6, 7, 8, 10, 44, 
                         25, 28, 30, 21, 33, 36, 37, 55, 60, 61, 62, 63, 14, 78, 79, 82, 88, 90, 91, 92,
                         93, 94, 95, 96, 97, 99, 100, 101, 102, 103};

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}