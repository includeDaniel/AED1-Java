package Conteudo8;

import java.util.Scanner;

public class c8ex22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, cont = 0;
        System.out.print("Digite um número inteiro: ");
        n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont <= 2) {
            System.out.println("Número primo");
        } else {
            System.out.println("Número não é primo");
        }
    }
}
