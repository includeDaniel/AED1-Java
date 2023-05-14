package Conteudo12;

import java.util.Scanner;

public class c12ex14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome[] = new String[100], temNome, estado[] = new String[100], tempEstado;
        int populacao[] = new int[100], temPopulacao;

        // Colocando os dados no array
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome da cidade: ");
            nome[i] = console.nextLine();
            System.out.print("Digite a população da cidade: ");
            populacao[i] = console.nextInt();
            console.nextLine();
            System.out.print("Digite o estado da cidade: ");
            estado[i] = console.nextLine();
            System.out.println();
        }
        console.close();

        for (int i = 0; i < populacao.length - 1; i++) {
            for (int j = 0; j < populacao.length - 1; j++) {
                if (populacao[j] < populacao[j + 1]) {
                    temPopulacao = populacao[j + 1];
                    populacao[j + 1] = populacao[j];
                    populacao[j] = temPopulacao;
                    temNome = nome[j + 1];
                    nome[j + 1] = nome[j];
                    nome[j] = temNome;
                    tempEstado = estado[j + 1];
                    estado[j + 1] = estado[j];
                    estado[j] = tempEstado;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(nome[i]);
            System.out.println(populacao[i]);
            System.out.println(estado[i]);
            System.out.println();

        }

    }
}
