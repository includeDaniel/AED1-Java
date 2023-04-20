package Conteudo10;

import java.util.Scanner;

public class c10ex06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double A, B, C, x0, y0, D;

        System.out.print("Digite o valor de A: ");
        A = console.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = console.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = console.nextDouble();

        do {
            System.out.print("Digite o valor de x0: ");
            x0 = console.nextDouble();
            System.out.print("Digite o valor de y0: ");
            y0 = console.nextDouble();

            D = (float) (A * x0 + B * y0 + C) / Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
            System.out.println(D);
        } while (D != 0);

        console.close();
    }
}
