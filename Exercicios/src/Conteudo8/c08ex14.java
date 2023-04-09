package Conteudo8;

import java.util.Scanner;

public class c08ex14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        String symbol;
        System.out.print("Digite o um numero entre 1 e 20: ");
        n = console.nextInt();
        console.nextLine();
        System.out.print("Digite um simbolo qualquer: ");
        symbol = console.nextLine();
        System.out.println();
        for (int colum = 1; colum <= n; colum++) {
            for (int row = 1; row <= n; row++) {
                System.out.print(symbol + " ");

            }
            System.out.print("\n");
        }
        console.close();
    }
}
