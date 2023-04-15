package Conteudo9;

import java.util.Scanner;

public class c09ex05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = 0, den = 0, serie = 0;
        int rep;
        System.out.print("Digite a quantidade de termos: ");
        rep = console.nextInt();
        for (int i = 1; i <= rep; i++) {
            num = (i - 1) * 2 + (i * 3);
            den = i * 6 + 1;
            serie += num / den;
        }
        serie = 5 * serie;
        System.out.print(serie);
        console.close();
    }
}
