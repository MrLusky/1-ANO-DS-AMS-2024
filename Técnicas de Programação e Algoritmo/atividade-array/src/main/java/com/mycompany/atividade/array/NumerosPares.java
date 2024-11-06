package com.mycompany.atividade.array;

public class NumerosPares {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        
         for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}

