package Conteudo5;

import java.util.Scanner;

public class CalcRaio {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);
        System.out.print("Digite o valor da Area: ");
        double areaSetorCircular = calculo.nextDouble();
        System.out.print("Digite o ângulo: ");
        double angulo = calculo.nextDouble();

        double raioAoQuadrado = (areaSetorCircular * 360) / (angulo * 3.1416);
        double raio = Math.sqrt(raioAoQuadrado);

        System.out.print(raio);
        calculo.close();
    }
}
