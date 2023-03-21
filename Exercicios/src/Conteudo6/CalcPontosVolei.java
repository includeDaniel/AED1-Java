package Conteudo6;

import java.util.Scanner;

public class CalcPontosVolei {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome da primeira equipe: ");
        String equipe1 = teclado.nextLine();
        System.out.print("Digite o nome da segunda equipe: ");
        String equipe2 = teclado.nextLine();
        System.out.print("Digite o numero de sets ganhos da equipe 1: ");
        int sets1 = teclado.nextInt();
        System.out.print("Digite o numero de sets ganhos da equipe 2: ");
        int sets2 = teclado.nextInt();

        if (sets1 == 3 && sets2 == 0 || sets1 == 3 && sets2 == 1) {
            System.out.print("A equipe: " + equipe1 + " recebeu 3 pontos");
            System.out.print("\nA equipe: " + equipe2 + " recebeu 0 pontos");
        } else if (sets2 == 3 && sets1 == 0 || sets2 == 3 && sets1 == 1) {
            System.out.print("A equipe: " + equipe1 + " recebeu 0 pontos");
            System.out.print("\nA equipe: " + equipe2 + " recebeu 3 pontos");
        } else if (sets1 == 3 && sets2 == 2) {
            System.out.print("A equipe: " + equipe1 + " recebeu 2 pontos");
            System.out.print("\nA equipe: " + equipe2 + " recebeu 1 ponto");
        } else if (sets2 == 3 && sets1 == 2) {
            System.out.print("A equipe: " + equipe1 + " recebeu 1 pontos");
            System.out.print("\nA equipe: " + equipe2 + " recebeu 2 pontos");
        }
        teclado.close();

    }
}
