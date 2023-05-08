package Conteudo12;

import java.util.Scanner;

public class c12ex03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite valores númericos inteiros: ");
            n[i] = console.nextInt();
        }
        for (int j = 0; j < n.length; j++) {
            System.out.println(Math.pow(n[j], 2));
        }
        console.close();
    }

}
