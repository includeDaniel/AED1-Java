package Conteudo9;

import java.util.Scanner;

public class c09ex04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = 0, den = 0, serie = 0;
        int rep;
        System.out.print("Digite a quantidade de termos: ");
        rep = console.nextInt();
        for (int i = 1; i <= rep; i++) {
            num = (i * 4 - 3) * (i * 4 - 2);
            den = (i * 4 - 1) * (i * 4);
            serie += num / den;
        }
        serie = Math.sqrt(serie);

        System.out.print(serie);
        console.close();
    }
}
