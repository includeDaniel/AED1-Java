package Conteudo5;

import java.util.Scanner;

public class c05ex07 {
    public static void main(String[] args) {
        Scanner equacao = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double valorX = equacao.nextDouble();
        double funcaoX = Math.sqrt((Math.pow(valorX / 4.0 + 1, 2)) + 1.0 / 5.0 * valorX);
        // Com formatação :
        // System.out.printf("F(x): %5.2f", funcaoX);
        System.out.print("F(x): " + funcaoX);
        equacao.close();
    }
}
