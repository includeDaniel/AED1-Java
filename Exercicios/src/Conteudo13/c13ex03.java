package Conteudo13;

import java.util.Scanner;

public class c13ex03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, p;
        System.out.print("Digite um número inteiro: ");
        n = console.nextInt();
        System.out.print("Digite uma posição de tras para frente do número: ");
        p = console.nextInt();

        System.out.println(Decomposicao(n, p));

        console.close();
    }

    public static int Decomposicao(int n, int p) {
        int resultado = 0;
        switch (p) {
            case 1 -> {
                // 123456789 -> 9
                resultado = n % 10;
            }
            case 2 -> {
                // 123456789 -> 8
                resultado = (n % 100) / 10;
            }
            case 3 -> {
                // 123456789 -> 7
                resultado = ((n % 1000) / 100);
            }
            case 4 -> {
                // 123456789 -> 6
                resultado = (n % 10000) / 1000;
            }
            case 5 -> {
                // 123456789 -> 5
                resultado = (n % 100000) / 10000;
            }
            case 6 -> {
                // 123456789 -> 4
                resultado = (n % 1000000) / 100000;
            }
            case 7 -> {
                // 123456789 -> 3
                resultado = (n % 10000000) / 1000000;
            }
            case 8 -> {
                // 123456789 -> 2
                resultado = (n % 100000000) / 10000000;
            }
            case 9 -> {
                // 123456789 -> 1
                resultado = (n % 1000000000) / 100000000;
            }
        }
        return resultado;
    }
}
