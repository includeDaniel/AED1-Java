package Conteudo12;

import java.util.Scanner;

public class c12ex16 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10];
        double multiplicador;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número inteiro: ");
            n[i] = console.nextInt();
        }
        System.out.print("Digite um número real: ");
        multiplicador = console.nextDouble();

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] * multiplicador);
        }
    }
}
