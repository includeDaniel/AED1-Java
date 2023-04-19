package Conteudo10;

import java.util.Scanner;

public class c10ex01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double valorDigitado = 0, multa, soma = 0, media = 0;
        int cont = 0;
        do {
            System.out.print("Digite o valor financeiro: ");
            valorDigitado = console.nextDouble();
            if( valorDigitado != -1 ) {
                multa = valorDigitado * 10 / 100;
                soma += multa;
                cont++;
                System.out.println("O valor da multa é: " + multa );
            }

        } while (valorDigitado != -1);
        media = soma / cont;
        System.out.printf("\nA média das multas: %.2f" + media );
    }
}
