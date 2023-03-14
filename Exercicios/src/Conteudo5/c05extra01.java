package Conteudo5;

import java.util.Scanner;

public class c05extra01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 4 digitos: ");
        // 0000
        int numero = teclado.nextInt();
        int primeiroNumero = numero / 1000;
        int segundoNumero = (numero % 1000) / 100;
        int terceiroNumero = (numero % 100) / 10;
        int quartoNumero = numero % 10;

        if (primeiroNumero + terceiroNumero == quartoNumero + segundoNumero && segundoNumero == terceiroNumero) {
            System.out.println("Este número é palíndromo");
        } else {
            System.out.println("Este número não é palíndromo");
        }
        teclado.close();
    }
}
