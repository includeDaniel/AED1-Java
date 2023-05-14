package Conteudo12;

import java.util.Scanner;

public class c12ex18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomes[] = new String[10], nomePesquisado;
        int posicao = 0;
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa que esta em " + (i + 1) + " na fila : ");
            nomes[i] = console.nextLine();
        }
        System.out.print("Quem você quer encontrar na fila: ");
        nomePesquisado = console.nextLine();
        console.close();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomePesquisado)) {
                posicao = i + 1;
            }
        }
        if (posicao != 0) {
            System.out.println("Está na posição: " + posicao);
        } else {
            System.out.println("Pessoa não encontrada");
        }
    }
}
