package Conteudo6;

import java.util.Scanner;

public class FormataHorasMinutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horaInicial = teclado.nextInt();
        System.out.print("Minuto inicial: ");
        int minutoInicial = teclado.nextInt();
        System.out.print("Hora Final: ");
        int horaFinal = teclado.nextInt();
        System.out.print("Minuto final: ");
        int minutoFinal = teclado.nextInt();

        int duracaoHoras = horaFinal - horaInicial;
        int duracaoMinutos = minutoFinal - minutoInicial;

        if (minutoFinal < minutoInicial) {
            duracaoHoras--;
            duracaoMinutos = duracaoMinutos + 60;
        }

        System.out.print("Duração: " + duracaoHoras + " hs " + duracaoMinutos + " min");
        teclado.close();
    }
}
