package Conteudo12;

import java.util.Scanner;

public class c12ex09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10], soma = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número inteiro: ");
            n[i] = console.nextInt();
            soma += n[i];
        }
        for (int i = 0; i < n.length; i++) {
            if (soma % n[i] == 0) {
                System.out.print(n[i] + " ");
            }
        }
    }
}
