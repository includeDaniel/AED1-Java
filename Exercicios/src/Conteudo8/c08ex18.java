package Conteudo8;

import java.util.Scanner;

public class c08ex18 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, r;
        System.out.print("A tabela de: ");
        n = console.nextInt();
        for(int i = 1; i <= 9; i++) {
            r = i * n;
            System.out.print("\n" + i + " X " + r);
        }
        console.close();
    }
}
