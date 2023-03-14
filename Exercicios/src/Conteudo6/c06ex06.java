package Conteudo6;

import java.util.Scanner;

public class c06ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite os valor de A: ");
        double A = teclado.nextDouble();
        System.out.print("Digite os valor de B: ");
        double B = teclado.nextDouble();
        System.out.print("Digite os valor de C: ");
        double C = teclado.nextDouble();

        double delta = (Math.pow(B, 2)) - 4 * A * C;
        double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
        double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (delta > 0) {
            System.out.print("2 raízes reais: " + raiz1 + ", " + raiz2);
        } else if (delta == 0) {
            System.out.print("1 raiz: " + raiz2);
        } else {
            System.out.print("não tem raizes");
        }

        teclado.close();
    }
}
