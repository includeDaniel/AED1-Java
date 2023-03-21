package Conteudo6;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        double valorX = teclado.nextDouble();
        if (valorX < 4) {
            double funcaoF = (5 * valorX + 3) / Math.sqrt(16 - Math.pow(valorX, 2));
            System.out.print("f(" + valorX + "): " + funcaoF);
        } else if (valorX == 4) {
            double funcaoF = 0;
            System.out.print("f(" + valorX + "): " + funcaoF);
        } else {
            double funcaoF = (5 * valorX + 3) / Math.sqrt(Math.pow(valorX, 2) - 16);
            System.out.print("f(" + valorX + "): " + funcaoF);
        }
        teclado.close();
    }
}
