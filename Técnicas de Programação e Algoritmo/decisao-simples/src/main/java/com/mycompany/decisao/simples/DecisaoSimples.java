package com.mycompany.decisao.simples;

import java.util.Scanner;

public class DecisaoSimples {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       
                boolean vip = false;
                boolean transacao = false;
                boolean bilhete = false;
               
               System.out.println("Digite sua idade:");
               int idade = sc.nextInt();
               sc.nextLine();
               
               if (idade <=5 || idade >= 60) {
                   System.out.println("Você tem acesso gratuito ao evento");
                   sc.close();
                   return;
               }
                
                System.out.println("Possui bilhete de estudante? (sim/não)");
                String resposta = sc.nextLine().trim().toLowerCase();
                bilhete = resposta.equals("sim");
                
                if (!bilhete) {
                    System.out.println("Você não possui direito a meia entrada. Prosseguir com pagamento? (sim/não)");
                    String pagamento = sc.nextLine().trim().toLowerCase();
                    transacao = pagamento.equals("sim");
                
                if (transacao) {
                    System.out.println("Obrigado pela compra!");
                } else {
                        System.out.println("Compra cancelada.");
                }
                    sc.close();
                    return;
                }
                
                if (bilhete) {
                    System.out.println("Você possui direito a meia entrada. Gostaria de acesso VIP? (Somente com meia entrada; taxa acrescentada)");
                    String acesso = sc.nextLine().trim().toLowerCase();
                    
                    vip = acesso.equals("sim");
                }
                
                System.out.println("Deseja prosseguir com o pagamento?");
                String pagamento = sc.nextLine().trim().toLowerCase();
                transacao = pagamento.equals("sim");
                
                if (vip && transacao) {
                    System.out.println("Obrigado pela compra! Acesso vip e meia entrada ratificadas.");
                } else if (transacao) {
                    System.out.println("Obrigado pela compra! Meia entrada ratificada.");
                } else {
                    System.out.println("Compra cancelada.");
                }
                
                sc.close();
    }
}