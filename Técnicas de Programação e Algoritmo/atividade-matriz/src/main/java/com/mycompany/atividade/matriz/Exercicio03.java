package com.mycompany.atividade.matriz;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        int quantImpares = 0;
        int quantPares = 0;
        boolean repete = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 == 0)  quantPares++;
                else quantImpares++;

                for (int k = 0; k < nums.length; k++) {
                    for (int l = 0; l < nums[k].length; l++) {
                        if (nums[i][j] == nums[k][l] && (k != i || l!=j)){
                            repete = true;
                        }
                    }
                }

            }
        }
        System.out.println("quantidade de impares: " + quantImpares);
        System.out.println("quantidade de pares: " + quantPares);
        System.out.println(repete? "Ha numeros repetidos" : "não ha numeros repetidos");

    }
}
