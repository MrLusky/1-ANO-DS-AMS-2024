package com.mycompany.atividade.array;

public class TabelaCampeonato {
    
    public static void main(String[] args) {
        String[] times = {"Botafogo", "Palmeiras", "Flamengo", "Grêmio", "Atlético-MG", "São Paulo", "Fluminense", "Internacional", "Cruzeiro", "Santos", 
                          "Fortaleza", "Athletico-PR", "Vasco", "Corinthians", "Bahia", "Cuiabá", "América-MG", "Red Bull Bragantino", "Coritiba", "Goiás"};

        int[] pontos = {68, 62, 60, 55, 54, 51, 50, 47, 45, 44, 
                        42, 40, 38, 36, 34, 32, 30, 28, 25, 22};

        System.out.println("Tabela de Classificação:");
        for (int i = 0; i < times.length; i++) {
            System.out.printf("%dº - %s: %d pontos%n", i + 1, times[i], pontos[i]);
        }
    }
}

