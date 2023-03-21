package Conteudo6;

import java.util.Scanner;

public class MultaPoluentes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de poluentes: ");
        double poluentes = teclado.nextDouble();
        if (poluentes <= 1500) {
            System.out.print("Isento de multa");
        } else if (poluentes > 1500 && poluentes < 3500) {
            System.out.print("Taxa de R$3.000,00");
        } else {
            double acima3500 = (5000 * poluentes);
            System.out.printf("Taxa de: %.4f", acima3500);
        }
        teclado.close();
    }
}
