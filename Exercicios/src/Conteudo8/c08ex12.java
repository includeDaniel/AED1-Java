package Conteudo8;

import java.util.Scanner;

public class c08ex12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a quantidade de vendas: ");
        int totalVendas = console.nextInt();
        int codigo, qnt;
        double precoUni = 0, faturamento = 0;

        for (int i = 1; i <= totalVendas; i++) {
            System.out.print("\n\nDigite o código do produto: ");
            codigo = console.nextInt();
            System.out.print("Digite a quantidade comprada: ");
            qnt = console.nextInt();

            switch (codigo) {
                case 1 -> {
                    precoUni = 1565.0;
                }
                case 2 -> {
                    precoUni = 1890.0;
                }
                case 3 -> {
                    precoUni = 2150.0;
                }
                case 4 -> {
                    precoUni = 2963.0;
                }
                case 5 -> {
                    precoUni = 3750.0;
                }
            }
            faturamento += qnt * precoUni;
        }
        System.out.print("O faturamento foi de: R$" + faturamento);
        console.close();
    }
}
