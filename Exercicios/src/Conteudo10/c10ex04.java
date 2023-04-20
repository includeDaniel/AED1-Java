package Conteudo10;

import java.util.Scanner;

public class c10ex04 {
    public static void main(String[] args) {
        double BDItaxa, BDI, precoUni, custoParcial, custoTotal = 0, precoFinal;
        String nome = "";
        int quantidade;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a taxa de BDI em porcentagem: " );
        BDItaxa = console.nextDouble();
        console.nextLine();
        do {

            System.out.print("Digite o nome: ");
            nome = console.nextLine();
             if(nome.equalsIgnoreCase("FIM")) {

             } else {
  
                System.out.print("Digite a quantidade: ");
                quantidade = console.nextInt();
                System.out.print("Digite o preço unitário de " + nome + ": ");
                precoUni = console.nextDouble();
                console.nextLine();

                custoParcial = quantidade * precoUni;
                custoTotal += custoParcial;
                System.out.printf("O custo parcial é: %.2f", custoParcial);
                System.out.println();
             }

        } while( !nome.equalsIgnoreCase("FIM"));

        BDI = custoTotal * (BDItaxa / 100.0);
        precoFinal = custoTotal + BDI;
        System.out.println("O custo total é: " + custoTotal);
        System.out.println("A BDI é: " + BDI);
        System.out.println("Preço final é: " + precoFinal);
        console.close();
    }
}
