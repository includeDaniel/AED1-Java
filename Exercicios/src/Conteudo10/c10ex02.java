package Conteudo10;

import java.util.Scanner;

public class c10ex02 {
    public static void main(String[] args) {
        double valor, soma = 0, media = 0;
        int cont = 0, cont2 = 0;
        Scanner console = new Scanner(System.in);
        do {
           
            System.out.println("Digite um valor recebido pela empresa, quando não houver mais valores digite - 0 - para parar o programa ");
            valor = console.nextDouble();
            
            if(valor == 0) {

            } else {
                soma += valor;
                cont++;
                if(valor > 1000) {
                    cont2++;
                }
            }
        } while( valor != 0 );
        console.close();
        media = soma / cont;
        System.out.println("A média dos valores recebidos: "  + media);
        System.out.println("O valor total recebido: " + soma);
        System.out.println("A quantidade de valores recebidos acima de R$1.000 é: " + cont2);
    }
}
