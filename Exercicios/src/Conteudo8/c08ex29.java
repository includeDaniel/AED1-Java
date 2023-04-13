package Conteudo8;

import java.util.Scanner;

public class c08ex29 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x, y, resposta = 1;
        System.out.print("Digite o valor de x: ");
        x = console.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = console.nextDouble();

        for (int i = 1; i <= y; i++) {
            resposta *= x;
        }
        System.out.println("X elevado a Y é igual a: " + resposta);

        console.close();
    }
}
