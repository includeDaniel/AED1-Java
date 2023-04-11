package Conteudo8;

import java.util.Scanner;

public class c08ex20 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n, r = 1, soma = 0;
        System.out.print("Digite a quantidade de termos: ");
        n = console.nextDouble();
        for (int i = 1; i <= n; i++) {
            System.out.println(r);
            soma += r;
            r = Math.pow(2, i);

        }
        System.out.printf("\nA soma dos termos e: %.31f", soma);
        console.close();
    }
}
