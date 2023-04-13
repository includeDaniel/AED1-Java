package Conteudo8;

import java.util.Scanner;

public class c08ex30 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x, n, s = 0, soma = 0;
        System.out.print("Digite o valor de x: ");
        x = console.nextDouble();
        System.out.print("Digite o valor de n: ");
        n = console.nextDouble();

        for (int i = 1; i <= n; i++) {
            s = (Math.pow(x, i) / i);
            soma += s;
        }
        System.out.println(soma);
    }
}
