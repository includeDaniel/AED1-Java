package Conteudo12;

import java.util.Scanner;

public class c12ex08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[20];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite 20 números inteiros: ");
            n[i] = console.nextInt();
        }
        System.out.println();
        for (int j = 0; j < n.length - 10; j++) {
            System.out.println(n[j] + n[j + 10]);
        }
        System.out.println();
        console.close();
    }
}
