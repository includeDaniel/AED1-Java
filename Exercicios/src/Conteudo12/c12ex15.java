package Conteudo12;

import java.util.Scanner;

public class c12ex15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10], soma = 0, cont = 0;
        double media = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número inteiro: ");
            n[i] = console.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.println(n[i]);
                soma += n[i];
                cont++;
            }
        }
        media = soma / cont;
        System.out.println("A média é: " + media);
        console.close();
    }
}
