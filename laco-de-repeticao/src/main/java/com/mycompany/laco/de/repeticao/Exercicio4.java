package com.mycompany.laco.de.repeticao;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial");
        int i = sc.nextInt();
        int ii = i;
        System.out.println("Digite o valor final");
        int f = sc.nextInt();
        int n = 0;
        System.out.println("\n");
        if(i>=f){
            System.out.println("ERRO: valor inicial DEVE ser menor que o valor final");
        }
        else{
            for(i = i+1; i<f; i++){
                if(i%2==0){
                    n = n+i;
                }
            }
            System.out.println("O resultado da soma dos numeros pares entre "+ii+" e "+f+" resulta em "+n);
        }
    }
}