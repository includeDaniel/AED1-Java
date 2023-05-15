package Conteudo12;

import java.util.Scanner;

public class c12ex20 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10], cont = 0, soma = 0;
        double media = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número inteiro: ");
            n[i] = console.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > n[9]) {
                System.out.println(n[i]);
                cont++;
                soma += n[i];
            }
        }
        media = (float) soma / cont;
        System.out.println("Media dos números impressos: " + media);
    }
}
