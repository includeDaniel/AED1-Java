package Conteudo11;

import java.util.Scanner;

public class c11ex04a {
    public static void main(String[] args) {
        String nome, sexo, nomeMaior = " ";
        int idade, pontosPerdidos, idadeTotal = 0, mulheresPontos = 0, idadeMaior = 0;
        double media = 0, multa = 0, multaTotal = 0, contHomens = 0, percentHomensMultados = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <= 230; i++) {
            System.out.println();
            System.out.print("Digite o nome: ");
            nome = console.nextLine();
            System.out.print("Digite a idade: ");
            idade = console.nextInt();
            console.nextLine();
            System.out.print("Sexo (M ou F): ");
            sexo = console.nextLine();
            System.out.print("Quantidade de pontos perdidos: ");
            pontosPerdidos = console.nextInt();
            System.out.print("Digite o valor da multa: ");
            multa = console.nextDouble();
            console.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                contHomens++;
            }
            percentHomensMultados = (contHomens * 100) / 230.0;

            if (sexo.equalsIgnoreCase("F") && pontosPerdidos == 7) {
                mulheresPontos++;
            }
            if (i == 1 || idade > idadeMaior) {
                idadeMaior = idade;
                nomeMaior = nome;
            }
            multaTotal += multa;
            idadeTotal += idade;
        }
        media = idadeTotal / 230;
        System.out.println();
        System.out.println("A média das idades é: " + media);
        System.out.println("Valor total das multas é: " + multaTotal);
        System.out.println("O percentual de homens multados é: " + percentHomensMultados + " por cento");
        System.out.println("quantidade de mulheres que perderam 7 pontos na carteira: " + mulheresPontos);
        System.out.println("O nome e a idade da pessoa mais velha é: " + nomeMaior + " e " + idadeMaior + " anos");
        console.close();
    }
}
