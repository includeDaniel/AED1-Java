package Conteudo8;

import java.util.Scanner;

public class c08ex10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome, maiorNome = "";
        double precoUni = 0, quantidadeCon = 0, totalValorCusto = 0,
                maiorCustoParcial = 0, custoParcial = 0;
        System.out.print("Digit a quantidade de Insumos: ");
        int insumos = console.nextInt();
        console.nextLine();
        for (int i = 1; i <= insumos; i++) {
            System.out.print("Digite o nome: ");
            nome = console.nextLine();
            System.out.print("Quantidade Consumida: ");
            quantidadeCon = console.nextDouble();
            console.nextLine();
            System.out.print("Preço unitário: ");
            precoUni = console.nextDouble();
            console.nextLine();

            custoParcial = precoUni * quantidadeCon;
            totalValorCusto += custoParcial;

            if (custoParcial > maiorCustoParcial) {
                maiorCustoParcial = custoParcial;
                maiorNome = nome;
            }
        }
        System.out.print("Custo total: " + totalValorCusto);
        System.out.print("\nMédia dos Custos Parciais: " + totalValorCusto / insumos);
        System.out.println("\nNome do insumo de maior custo parcial: " + maiorNome);

        console.close();
    }
}
