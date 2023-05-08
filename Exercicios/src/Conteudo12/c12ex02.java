package Conteudo12;

import java.util.Scanner;

public class c12ex02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite valores númericos inteiros: ");
            n[i] = console.nextInt();

        }
        for (int j = 0; j < n.length; j++) {
            if (n[j] > 5 && n[j] < 10) {
                System.out.println();
                System.out.println(n[j]);
            }
        }
        console.close();
    }
}
