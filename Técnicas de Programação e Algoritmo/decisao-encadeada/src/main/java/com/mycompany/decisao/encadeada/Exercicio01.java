package com.mycompany.decisao.encadeada;

import javax.swing.JOptionPane;

//Bom dia/tarde/noite professor. Deu um problema no meu microfone, então vou deixar 10 segundos do código na tela depois vou executar

public class Exercicio01 {
    public static void main(String[] args) {    
    int hc;
    hc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora que você chega no trabalho: "));
        switch (hc) {
            case 5:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da manhã.");
                break;
            case 13:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da tarde.");
                break;
            case 21:
                JOptionPane.showMessageDialog(null, "Você trabalha no turno da noite.");
                break;
            default:
                break;
        }
    }
}
