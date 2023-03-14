package Conteudo5;

import java.util.Scanner;

public class c05ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a duração do evento em segundos: ");
        int tempoPego = teclado.nextInt();
        int duracaoHoras = tempoPego / 3600;
        int duracaoMinutos = (tempoPego % 3600) / 60;
        int duracaoSegundos = ((tempoPego % 3600) % 60);

        System.out.println(duracaoHoras + " Horas " + duracaoMinutos + " Minutos e " + duracaoSegundos + " Segundos");

        teclado.close();
    }
}
