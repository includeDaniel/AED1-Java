package Conteudo5;

import java.util.Scanner;

public class c05extra02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do tempo(t) em segundos: ");
        double tempo = teclado.nextInt();
        System.out.print("Digite o valor da velocidade(v) em m/s: ");
        double velocidade = teclado.nextInt();
        double tempoRelativo = tempo
                * (1 / Math.sqrt(1 - (Math.pow(velocidade, 2) / Math.pow(((3 * Math.pow(10, 8))), 2))));
        System.out.printf("O tempo relativo é: %12.4f", tempoRelativo);
        System.out.print(" segundos");
        teclado.close();
    }
}
