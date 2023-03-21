package Conteudo7;

import java.util.Scanner;

public class CalcConceitoNota {
    public static void main(String[] args) {
        String conceito = "";
        int valor1, valor2, valor3, mediaInteira;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        valor1 = teclado.nextInt();
        System.out.print("Digite a segunda nota: ");
        valor2 = teclado.nextInt();
        System.out.print("Digite a terceira nota: ");
        valor3 = teclado.nextInt();

        mediaInteira = (valor1 + valor2 + valor3) / 3;

        switch (mediaInteira) {
            case 1, 2, 3, 4 ->
                conceito = "E";
            case 5, 6 ->
                conceito = "D";
            case 7 ->
                conceito = "C";
            case 8 ->
                conceito = "B";
            case 9, 10 ->
                conceito = "A";
        }
        System.out.print("Conceito " + conceito);
        teclado.close();
    }
}
