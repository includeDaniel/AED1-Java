package Conteudo6;

import java.util.Scanner;

public class PesoMinMax {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = teclado.nextLine();
        System.out.print("Digite a sua altura(metros): ");
        double altura = teclado.nextDouble();

        double pesoMin = 20 * Math.pow(altura, 2);
        double pesoMax = 25 * Math.pow(altura, 2);

        System.out.print(
                name + "o peso mínimo para o ideal é: " + pesoMin + " e para o máximo para o ideal é: " + pesoMax);
        teclado.close();
    }

}
