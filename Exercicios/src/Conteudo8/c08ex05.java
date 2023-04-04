package Conteudo8;

import java.util.Scanner;

public class c08ex05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int fulano = 0, ciclano = 0, beltrano = 0, voto;
        for (int i = 1; i <= 5; i++) {
            System.out.print("\nCANDIDATOS: FULANO || CICLANO || BELTRANO\n ");
            System.out.print("\nDigite o número do candidato(do 1 ao 3): ");
            voto = console.nextInt();
            switch (voto) {
                case 1 -> {
                    fulano++;
                }
                case 2 -> {
                    ciclano++;
                }
                case 3 -> {
                    beltrano++;
                }
                default -> {
                    System.out.println("\nNão há voto nulo, vote novamente");
                    i--;
                }
            }
        }
        if (fulano == ciclano && fulano == beltrano) {
            System.out.print("Não pode haver empate");
        } else {
            System.out.print("\n            FULANO recebeu: " + fulano + " votos\n");
            System.out.print("\n            CICLANO recebeu: " + ciclano + " votos\n");
            System.out.print("\n            BELTRANO recebeu " + beltrano + " votos\n");

            if (fulano > ciclano && fulano > beltrano) {
                System.out.print("\nO VENCEDOR É FULANO");
            } else if (ciclano > fulano && ciclano > beltrano) {
                System.out.print("\nO VENCEDOR É CICLANO");
            } else {
                System.out.print("\nO VENCEDOR É BELTRANO");
            }

        }
        console.close();
    }
}
