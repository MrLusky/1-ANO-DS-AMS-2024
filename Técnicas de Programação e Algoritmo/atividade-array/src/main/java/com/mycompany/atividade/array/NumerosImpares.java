package com.mycompany.atividade.array;

public class NumerosImpares {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        
        // Preencher array com 100 números consecutivos
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números ímpares:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
