package Conteudo11;

import java.util.Scanner;

public class c11ex01 {
    public static void main(String[] args) {
        int n, cont = 0;
        double f = 0, soma = 0, media = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = console.nextInt();
        for(int i = 1; i <= n; i+=2) {
            f = Math.pow(i, 2) + (4*i - 2) / 5.0;
            System.out.println(f);
            soma += f;
            cont++;
        }
        media = soma / cont;
        System.out.print("A média é: " + media);
        console.close();
    }
}
