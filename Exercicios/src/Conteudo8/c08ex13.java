package Conteudo8;

import java.util.Scanner;

public class c08ex13 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(c08ex13.class.getResourceAsStream("c08ex13.txt"));
        String cidade = "",
                populacao,
                eleitores,
                homens,
                mulheres,
                menorPopulacaoCidade = "";

        int contador1 = 0, contador2 = 0;

        double homensNum, mulheresNum, eleitoresNum, populacaoNum, percentualE, menorPopulacao = 0;

        for (int i = 1; i <= 5; i++) {
            cidade = dados.nextLine();
            populacao = dados.nextLine();
            eleitores = dados.nextLine();
            homens = dados.nextLine();
            mulheres = dados.nextLine();

            mulheresNum = Double.valueOf(mulheres);
            homensNum = Double.valueOf(homens);
            eleitoresNum = Double.valueOf(eleitores);
            populacaoNum = Double.valueOf(populacao);

            System.out.println("\n\nCidade: " + cidade);
            System.out.println("População: " + populacao);
            System.out.println("Eleitores: " + eleitores);
            System.out.println("Homens: " + homens);
            System.out.println("Mulheres: " + mulheres);

            if (homensNum + mulheresNum != populacaoNum) {
                System.out.println("Soma de Homens e Muheres é diferente da população");
            }

            percentualE = (eleitoresNum * 100) / populacaoNum;
            System.out.printf("O percentual de eleitores é: %.1f", percentualE);

            if (populacaoNum > 1000000) {
                contador1++;
            }

            if (mulheresNum > homensNum) {
                contador2++;
            }

            if (i == 1 || populacaoNum < menorPopulacao) {
                menorPopulacao = populacaoNum;
                menorPopulacaoCidade = cidade;
            }
        }
        System.out.println("\n\nQuantidade cidades com mais de um milhão: " + contador1);
        System.out.println("Quantidade de cidades com mais mulheres e homens " + contador2);
        System.out.println("Cidade com menor população: " + menorPopulacaoCidade + "\n\n");
        dados.close();
    }
}
