package Conteudo6;

import java.util.Scanner;

public class CalcValorResgatado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o capital aplicado: ");
        double capitaoA = teclado.nextDouble();
        System.out.print("Digite o numero dias: ");
        int numeroDias = teclado.nextInt();
        System.out.print("Digite a taxa diária: ");
        double taxaDiaria = teclado.nextDouble();

        double rendimento = capitaoA * (taxaDiaria / 100) * numeroDias;
        double impostoRenda = rendimento * 15 / 100;
        double valorResgatado = capitaoA + rendimento - impostoRenda - 10;

        System.out.print("Valor resgatado: " + valorResgatado);

        teclado.close();
    }
}
