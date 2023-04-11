package Conteudo8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class c08ex21 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double altura, imc = 1;
        String situacaoCorporea, imcFormatado;
        System.out.print("Digite a sua altura: ");
        altura = console.nextDouble();
        System.out.println();
        System.out.print("Peso         IMC          Situacao Corporea\n\n");
        for (int i = 60; i <= 100; i++) {
            imc = i / (Math.pow(altura, 2));
            imcFormatado = new DecimalFormat("#,###0.0").format(imc);
            if (imc < 20) {
                situacaoCorporea = "Abaixo do peso";
            } else if (imc >= 20 && imc <= 25) {
                situacaoCorporea = "Peso ideal";
            } else {
                situacaoCorporea = "Acima do peso";
            }
            System.out.println(i + "     |     " + imcFormatado + "     |     " + situacaoCorporea);
        }
        console.close();
    }
}
