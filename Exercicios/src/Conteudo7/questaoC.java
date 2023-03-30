//Daniel Nunes da Silva
package Conteudo7;

import java.util.Scanner;

public class questaoC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int RA, copiasX, produtosAd, codigodoCurso;
        double percentualBolsa, mensalidade, valorBoleto, copiasXprecoUni, totalValorCopiasX, totalBolsa;
        // 12345
        String bolsa;
        System.out.print("Digite o Registro academico(5 digitos): ");
        RA = teclado.nextInt();
        System.out.print("Quantidade de cópias xerox: ");
        copiasX = teclado.nextInt();
        System.out.print("Valor total de produtos adquiridos pelo aluno: ");
        produtosAd = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Tem bolsa(S ou N): ");
        bolsa = teclado.nextLine();

        codigodoCurso = RA / 10000;

        if (codigodoCurso == 1) {
            if (bolsa.equalsIgnoreCase("S")) {
                percentualBolsa = 0.05;
            } else {
                percentualBolsa = 0;
            }
            mensalidade = 1200.0;
        } else if (codigodoCurso == 2) {
            if (bolsa.equalsIgnoreCase("S")) {
                percentualBolsa = 0.1;
            } else {
                percentualBolsa = 0;
            }
            mensalidade = 1350.0;
        } else if (codigodoCurso == 3) {
            if (bolsa.equalsIgnoreCase("S")) {
                percentualBolsa = 0.15;
            } else {
                percentualBolsa = 0;
            }
            mensalidade = 2100.0;
        } else {
            if (bolsa.equalsIgnoreCase("S")) {
                percentualBolsa = 0.30;
            } else {
                percentualBolsa = 0;
            }
            mensalidade = 3200.0;
        }

        if (copiasX <= 50.0) {
            copiasXprecoUni = 0.09;
        } else if (copiasX > 50 && copiasX <= 500) {
            copiasXprecoUni = 0.08;
        } else {
            copiasXprecoUni = 0.06;
        }
        totalBolsa = mensalidade * percentualBolsa;
        totalValorCopiasX = copiasX * copiasXprecoUni;
        valorBoleto = mensalidade + totalValorCopiasX + produtosAd - totalBolsa;
        System.out.printf("Valor do boleto: R$%.2f", valorBoleto);
        teclado.close();
    }
}
