package Conteudo6;

import java.util.Scanner;

public class c06ex15 {
    public static void main(String[] args) {
        // conta a ser paga = valor fixo mensal + ao consumo dos canais
        Scanner teclado = new Scanner(System.in);
        int codigoP, qntDias, valorFixo;
        double extras, imposto, impostoParte, conta, diariasCanaisPPP;
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
            if (extras == 0) {
                impostoParte = (valorFixo / diariasCanaisPPP);
            } else {
                impostoParte = (valorFixo / diariasCanaisPPP / extras);
            }

            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                imposto = 0;
            } else if (cidade.equalsIgnoreCase("São Paulo")) {
                imposto = impostoParte / 1.0 / 100;
            } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                imposto = impostoParte / 1.5 / 100;
            } else {
                imposto = impostoParte / 2.0 / 100;
            }
            conta = valorFixo + extras + diariasCanaisPPP + imposto;
            System.out.print("Conta: " + conta);
        }
        if (codigoP == 2) {
            valorFixo = 104;
            diariasCanaisPPP = qntDias * 2.10;
            if (extras == 0) {
                impostoParte = (valorFixo / diariasCanaisPPP);
            } else {
                impostoParte = (valorFixo / diariasCanaisPPP / extras);
            }

            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                imposto = 0;
            } else if (cidade.equalsIgnoreCase("São Paulo")) {
                imposto = impostoParte / 1 / 100;
            } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                imposto = impostoParte / 1.5 / 100;
            } else {
                imposto = impostoParte / 2 / 100;
            }
            if (extras == 0) {
                imposto = (valorFixo / diariasCanaisPPP) / 1.5 / 100;
            } else {
                imposto = (valorFixo / diariasCanaisPPP / extras) / 1.5 / 100;
            }
            conta = valorFixo + extras + diariasCanaisPPP + imposto;
            System.out.print("Conta: " + conta);
        }
        if (codigoP == 3) {
            valorFixo = 104;
            diariasCanaisPPP = qntDias * 2.10;
            if (extras == 0) {
                impostoParte = (valorFixo / diariasCanaisPPP);
            } else {
                impostoParte = (valorFixo / diariasCanaisPPP / extras);
            }

            if (cidade.equalsIgnoreCase("Belo Horizonte")) {
                imposto = 0;
            } else if (cidade.equalsIgnoreCase("São Paulo")) {
                imposto = impostoParte / 1 / 100;
            } else if (cidade.equalsIgnoreCase("Rio de Janeiro")) {
                imposto = impostoParte / 1.5 / 100;
            } else {
                imposto = impostoParte / 2 / 100;
            }
            if (extras == 0) {
                imposto = (valorFixo / diariasCanaisPPP) / 1.5 / 100;
            } else {
                imposto = (valorFixo / diariasCanaisPPP / extras) / 1.5 / 100;
            }
            conta = valorFixo + extras + diariasCanaisPPP + imposto;
            System.out.print("Conta: " + conta);

        }
    }
}
