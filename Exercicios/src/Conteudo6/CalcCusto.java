package Conteudo6;

import java.util.Scanner;

public class CalcCusto {
    public static void main(String[] args) {
        int bolasProduzidas, bolasComDefeito, numeroCaixas, galpoes;
        double caixaPapelaoP, mesesParaCopa, aluguelMensal,
                custoTotalEmbalagens, custoTotalEstocagem, custoTotal;
        // 1 caixa de papelão = até 10 bolas
        // 1 galpão = 850 caixas de papelão
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o numero de bolas: ");
        bolasProduzidas = teclado.nextInt();
        System.out.print("Digite o numero de bolas com defeito: ");
        bolasComDefeito = teclado.nextInt();
        System.out.print("Digite o preço unitário da caixa de papelão: ");
        caixaPapelaoP = teclado.nextDouble();
        System.out.print("Quantidade de meses pra copa: ");
        mesesParaCopa = teclado.nextDouble();
        System.out.print("Digite o valor mensal do aluguel: ");
        aluguelMensal = teclado.nextDouble();

        int totalbolas = bolasProduzidas - bolasComDefeito;

        if (totalbolas % 10 > 0) {
            numeroCaixas = totalbolas / 10;
            numeroCaixas++;
        } else {
            numeroCaixas = totalbolas / 10;
        }
        if (numeroCaixas % 850 > 0) {
            galpoes = numeroCaixas / 850;
            galpoes++;
        } else {
            galpoes = numeroCaixas / 850;
        }
        custoTotalEmbalagens = numeroCaixas * caixaPapelaoP;
        custoTotalEstocagem = aluguelMensal * mesesParaCopa * galpoes;
        custoTotal = custoTotalEstocagem + custoTotalEmbalagens;
        System.out.printf("Custo total: %.2f", custoTotal);

        teclado.close();
    }
}
