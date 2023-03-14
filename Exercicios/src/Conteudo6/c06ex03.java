package Conteudo6;

import java.util.Scanner;

public class c06ex03 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        System.out.print("Digite o número de vendas mensais: ");
        int vendasMensais = teclado.nextInt();
        int salario, comissao;

        if( vendasMensais <= 1000 ) {
            comissao = 0;
            salario = 240;
            System.out.print("Seu salário é: " + salario);
        } else if( vendasMensais > 1000 && vendasMensais <= 10000 ) {
            salario = 240 + (vendasMensais * 10 / 100);
            System.out.print("Seu salário é: " + salario) ;
        } else {
            salario = 240 + 1000;
            System.out.print("Seu salário é: " + salario );
        }
    }
}
