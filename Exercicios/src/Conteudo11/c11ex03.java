package Conteudo11;

import java.util.Scanner;

public class c11ex03 {
    public static void main(String[] args) {
        String dia, placa, pontos;
        double multa = 0, multaTotal = 0;
        int cont = 0;
        Scanner dados = new Scanner(c11ex03.class.getResourceAsStream("c11ex03.txt"));
        do {
            dia = dados.nextLine();
            if( dia.equalsIgnoreCase("99")) {

            } else {
                placa = dados.nextLine();
                pontos = dados.nextLine();
                switch (pontos) {
                    case "3" -> {
                        multa = 42;
                    }
                    case "5" -> {
                        multa = 108;
                    }
                    case "8" -> {
                        multa = 479;
                    }
                }
                int dNumber = Integer.valueOf(dia);
                if( dNumber <= 15 && pontos.equalsIgnoreCase("8")) {
                    cont++; 
                }

                multaTotal += multa;
                System.out.println("A placa é: " + placa);
                System.out.println("A multa aplicada é: " + multa);
                
            }
        } while (!dia.equalsIgnoreCase("99"));
        System.out.println();
        System.out.println("A quantidade de multas de pontuacao 8 da primeira quinzena do mês: " + cont);
        System.out.println("O valor total arrecadado: " + multaTotal);
    }
}
