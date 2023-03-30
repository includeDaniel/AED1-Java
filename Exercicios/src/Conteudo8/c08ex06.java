package Conteudo8;

import java.util.Scanner;

public class c08ex06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numero, divisivelPor4 = 0, divisivelPor3 = 0, soma = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numero = console.nextInt();

            if (numero % 2 == 0) {
                System.out.print("\no número é Par\n\n");
            } else {
                System.out.print("\nO número é Ímpar\n\n");
            }
            
            if(numero % 4 == 0) {
                soma += numero;
                divisivelPor4++;
            }

            if(numero % 3 == 0) {
                divisivelPor3++;
            }
        }
        
        System.out.print("A soma dos numeros divisíveis por 4 é: " + soma  + "\n");
        System.out.print("A quantidade de números divisíveis por 4 é: " + divisivelPor4 + "\n");
        System.out.print("A quantidade de números divisíveis por 3 é: " + divisivelPor3);
        console.close();
    }
}
