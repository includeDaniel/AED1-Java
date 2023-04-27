package Conteudo11;

import java.util.Scanner;

public class c11ex02a {
    public static void main(String[] args) {
        String nome, classificacao, menorNome = "";
        int contB = 0, contP = 0, contO = 0;
        double valorAplicado, valorAplicadoBronzeTotal = 0, media = 0, valorAplicadoTotal = 0, menorValorAplicado = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nDigite o nome do cliente: ");
            nome = console.nextLine();
            System.out.print("\nDigite o valor aplicado: ");
            valorAplicado = console.nextDouble();
            console.nextLine();

            if (valorAplicado <= 1000) {
                classificacao = "bronze";
                contB++;
                valorAplicadoBronzeTotal += valorAplicado;
            } else if (valorAplicado > 1000 && valorAplicado <= 5000) {
                classificacao = "Prata";
                contP++;
            } else {
                classificacao = "Ouro";
                contO++;
            }
            valorAplicadoTotal += valorAplicado;
            if (i == 1 || valorAplicado < menorValorAplicado) {
                menorValorAplicado = valorAplicado;
                menorNome = nome;
            }
            System.out.println("O(a)" + nome + "foi classificado como " + classificacao);
            console.close();
        }
        System.out.println("No bronze existe: " + contB + " clientes\nno Prata existem: " + contP
                + " clientes\nno Ouro existem: " + contO + " clientes \n");
        media = (float) valorAplicadoBronzeTotal / contB;
        System.out.printf("A média dos valoes aplicados dos clientes bronze é: %.2f", media);
        System.out.println();
        System.out.printf("O volume total de aplicações é:  %.2f", valorAplicadoTotal);
        System.out.println();
        System.out.println("Nome do menor aplicador: " + menorNome);
    }
}
