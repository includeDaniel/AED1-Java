package Conteudo7;

import java.util.Scanner;

public class TimeDeQualEstado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome de uma equipe: ");
        String nome = teclado.nextLine();
        switch (nome) {
            case "América", "Atlético", "Cruzeiro", "Villa Nova" -> {
                System.out.print("Pertence a Minas Gerais");
            }
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" -> {
                System.out.print("Pertence ao Rio de Janeiro");
            }
            case "Corinthians", "Palmeiras", "Santos", "São Paulo" -> {
                System.out.print("Pertence a São Paulo");
            }
            case "Grêmio", "Internacional", "Juventude" -> {
                System.out.println("Pertence ao Rio Grande do Sul");
            }
            case "Náutico", "Santa Cruz", "Sport" -> {
                System.out.print("Pertence a Pernambuco");
            }
            default -> {
                System.out.println("Insira um nome de time valido");
            }
        }
        teclado.close();
    }
}
