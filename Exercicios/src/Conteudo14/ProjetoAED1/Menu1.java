package Conteudo14.ProjetoAED1;

import java.util.Scanner;

public class Menu1 {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println();
        System.out.println("Calcular o Fatorial - digite '1'");
        System.out.println("Calcular o Hipotenusa - digite '2'");
        System.out.println("Calcular o Distancia entre Pontos - digite '3'");
        System.out.println("Calcular o Imposto de Renda - digite '4'");
        System.out.println("Verificar se algum número é Palindromo - digite '5'");
        System.out.println();
        opcao = console.nextInt();
        System.out.println();

        do {
            switch (opcao) {
                case 1 -> {
                    ClasseCalculaFatorial.CalculaFatorial();
                }
                case 2 -> {
                    ClasseCalculaHipotenusa.CalcHipotenusa();
                }
                case 3 -> {
                    ClasseCalculaDistanciaEntrePontos.CalcDistanciaEntrePontos();
                }
                case 4 -> {
                    ClasseCalculaImpostoDeRenda.CalcImpostoDeRenda();
                }
                case 5 -> {
                    ClasseVerificaPalindromo.VerificaPalindromo();
                }
                default -> {
                    System.out.println("Digite um número de 1 até 5");

                }
            }
        } while (opcao > 5 || opcao < 1);
    }
}
