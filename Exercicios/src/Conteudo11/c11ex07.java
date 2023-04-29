package Conteudo11;

import java.util.Scanner;

public class c11ex07 {
    public static void main(String[] args) {
        int cont = 0;
        double temperatura, maiorTemperatura = 0, menorTemperatura = 0, temperaturaSoma = 0, media;
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <= 121; i++) {
            System.out.print("Digite a temperatura: ");
            temperatura = console.nextDouble();

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
                cont++;
            }
            if (i == 1 || temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            temperaturaSoma += temperatura;
        }
        console.close();
        media = temperaturaSoma / 121.0;
        System.out.println();
        System.out.println("A menor temperatura registrada: " + menorTemperatura);
        System.out.println("A maior temperatura registrada: " + maiorTemperatura);
        System.out.println("Média das temperaturas registrads: " + media);
        System.out.println("A quantidade de dias que ocorreu a maior temperatura: " + cont);
    }
}
