package Conteudo11;

import java.util.Scanner;

public class c11ex12 {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 9");
        System.out.print("Número: ");
        n = console.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int h = i; h >= 1; h--) {
                System.out.print(h);
            }
            System.out.println(" ");
        }
        console.close();
    }
}
