package Conteudo9;

import java.util.Scanner;

public class c09ex09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = 0, den = 0, serie = 0;
        int rep;
        System.out.print("Digite a quantidade de termos: ");
        rep = console.nextInt();
        for (int i = 1; i <= rep; i++) {

            num = Math.pow(3, i + 1);
            den = (9 + i) * Math.sqrt(Math.pow(i * i, 2));

            serie += num / den;
        }
        serie = 100 - Math.pow(serie, 3);
        System.out.println(serie);
    }
}
