package Conteudo6;

import java.util.Scanner;

public class c06ex15 {
    public static void main(String[] args) {
        // conta a ser paga = valor fixo mensal + ao consumo dos canais
        Scanner teclado = new Scanner(System.in);
        int codigoP, qntDias, valorFixo = 0;
        double extras, imposto, impostoTotal, conta, diariasCanaisPPP = 0;
        String cidade;
        System.out.print("Digite o código do seu pacote: ");
        codigoP = teclado.nextInt();
        System.out.print("Digite a quantidade de dias: ");
        qntDias = teclado.nextInt();
        System.out.print("Digite o valor dos serviços extras: ");
        extras = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite a sua cidade: ");
        cidade = teclado.nextLine();

        if (codigoP == 1) {
            valorFixo = 65;
            diariasCanaisPPP = qntDias * 1.20;
            if (diariasCanaisPPP > valorFixo) {
                diariasCanaisPPP = 65;
            }
        } else if (codigoP == 2) {
            valorFixo = 104;
            diariasCanaisPPP = qntDias * 2.10;
        } else if (codigoP == 3) {
            valorFixo = 137;
            diariasCanaisPPP = qntDias * 0;

        }

        if (cidade.equalsIgnoreCase("Belo Horizonte")) {
            imposto = 0;
        } else if (cidade.equalsIgnoreCase("São Paulo")) {
            imposto = 1.0 / 100;
        } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
            imposto = 1.5 / 100;
        } else {
            imposto = 2.0 / 100;
        }
        impostoTotal = (valorFixo + diariasCanaisPPP + extras) * imposto;
        conta = valorFixo + extras + diariasCanaisPPP + impostoTotal;
        System.out.printf("Conta: %.2f", conta);
        teclado.close();

    }
}