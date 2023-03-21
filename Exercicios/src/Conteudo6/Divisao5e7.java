package Conteudo6;

import java.util.Scanner;

public class Divisao5e7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        if (numero % 5 == 0 && numero % 7 == 0) {
            System.out.print(numero + " é divisível simultaneamente por 5 e 7");
        } else {
            System.out.print(numero + " não é divisível simultaneamente por 5 e 7");
        }
        teclado.close();
    }
}
