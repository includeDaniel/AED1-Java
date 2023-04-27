package Conteudo10;

import java.util.Scanner;

public class c10ex07 {
    public static void main(String[] args) {
        double populacao, infectados = 1, anosConta = 0,
                mesesConta = 0,
                diasConta;
        int contDia = 0;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite a população: ");
        populacao = console.nextDouble();
        do {
            infectados += (infectados * 0.003);
            contDia++;

        } while (infectados <= populacao);
        anosConta = contDia / 365;
        mesesConta = (contDia - (anosConta * 365)) / 30;
        int meses = (int) mesesConta;
        diasConta = contDia - (anosConta * 365) - (meses * 30);
        int dias = (int) diasConta;
        int anos = (int) anosConta;
        
        System.out.println("Demorará " + anos + " anos " + meses + " meses e " + dias
                + " dias para todas as pessoas serem infectadas");
        console.close();
    }
}
