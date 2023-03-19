package Conteudo6;

import java.util.Scanner;

public class c06ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // 1234
        System.out.print("Digite um numero de 4 digitos: ");
        int numero = teclado.nextInt();
        // 9999
        if (numero > 9999 || numero < 1000) {
            System.out.print("NUMERO TEM QUE TER 4 DIGITOS.");
        } else {
            int primeiroD = numero / 1000;
            int segundoD = (numero % 1000) / 100;
            int terceiroD = (numero % 100) / 10;
            int quartoD = numero % 10;
            System.out.println(quartoD + "" + terceiroD + "" + segundoD + "" + primeiroD);
        }

        teclado.close();
    }
}
