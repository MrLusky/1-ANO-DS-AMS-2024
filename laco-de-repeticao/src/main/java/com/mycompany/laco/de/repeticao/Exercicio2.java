package com.mycompany.laco.de.repeticao;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = sc.nextInt();
        for(int x = 0; x<=10; x++){
            int r = n*x;
            System.out.println(n+" * "+x+" = "+r);
        }
    }
}