package Conteudo9;

import java.util.Scanner;

public class c09ex03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num, den, serie = 0;
        int rep;
        System.out.print("Digite a quantidade de termos: ");
        rep = console.nextInt();
        for (int i = 1; i <= rep; i++) {

            num = 1 + Math.sqrt(i * 4);

            den = i * 3;

            serie += num / den;
        }

        System.out.printf("%.14f", serie);
        console.close();
    }
}
