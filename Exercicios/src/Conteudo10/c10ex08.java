package Conteudo10;

import java.util.Scanner;

public class c10ex08 {
    public static void main(String[] args) {
        String nomeCidade, menorNomeCidade = "";
        int populacao, menorPopulacao = 0, populacaoTotal = 0, numeroEleitores, numeroEleitoresTotal = 0,
                qntHomens, qntMulheres, cont = 0, cont2 = 0, qntHomensTotal = 0, mediaQntHomens = 0;
        double porcentagemEleitoresTotal = 0;
        Scanner console = new Scanner(System.in);

        do {

            System.out.print("\nDigite o nome da cidade: ");
            nomeCidade = console.nextLine();
            System.out.print("Digite o numero de população: ");
            populacao = console.nextInt();
            System.out.print("Digite o número de eleitores: ");
            numeroEleitores = console.nextInt();
            System.out.print("Quantidade de homens: ");
            qntHomens = console.nextInt();
            System.out.print("Quantidade de mulheres: ");
            qntMulheres = console.nextInt();
            console.nextLine();

            if (qntHomens + qntMulheres != populacao) {
                System.out.println("Quantidade de homens e mulheres é diferente da quantidade de eleitores\n");
            }
            numeroEleitoresTotal += numeroEleitores;

            populacaoTotal += populacao;

            qntHomensTotal += qntHomens;

            if (qntMulheres > qntHomens) {
                cont2++;
            }

            cont++;

            if (cont == 1 || populacao < menorPopulacao) {
                menorPopulacao = populacao;
                menorNomeCidade = nomeCidade;
            }

        } while (!nomeCidade.equalsIgnoreCase("Zimbabue de Minas"));
        mediaQntHomens = qntHomensTotal / cont;
        porcentagemEleitoresTotal = (numeroEleitoresTotal * 100.0) / populacaoTotal;
        System.out.println("Quantidade de cidades do estado: " + cont);
        System.out.println("População total do estado: " + populacaoTotal);
        System.out.println("Porcentagem de eleitores total: " + porcentagemEleitoresTotal);
        System.out.println("Cidades em que cuja a população tem mais mulheres: " + cont2);
        System.out.println("Média de homens: " + mediaQntHomens);
        System.out.println("Cidade com menor população: " + menorNomeCidade);

        console.close();
    }
}
