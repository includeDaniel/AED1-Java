package Conteudo13;

import java.util.Scanner;

public class c13ex01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.print("Digite as cordenadas de x1: ");
        x1 = console.nextDouble();
        System.out.print("Digite as cordenadas de x2: ");
        x2 = console.nextDouble();
        System.out.print("Digite as cordenadas de y1: ");
        y1 = console.nextDouble();
        System.out.print("Digite as cordenadas de y2: ");
        y2 = console.nextDouble();
        console.close();

        System.out.println(CalculaDistancia(x1, x2, y1, y2));
    }

    public static double CalculaDistancia(double x1, double x2, double y1, double y2) {
        double distancia, parte1, parte2;
        parte1 = Math.pow((x1 - x2), 2);
        parte2 = Math.pow((y1 - y2), 2);
        distancia = Math.sqrt((parte1 + parte2));

        return (distancia);
    }
}
