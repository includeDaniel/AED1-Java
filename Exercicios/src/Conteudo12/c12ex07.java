package Conteudo12;

import java.util.Scanner;

public class c12ex07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String names[] = new String[50], conceito;
        double nota[] = new double[50];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            names[i] = console.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = console.nextDouble();
            console.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);

            if (nota[i] <= 30) {
                conceito = "D";
            } else if (nota[i] > 30 && nota[i] <= 60) {
                conceito = "C";
            } else if (nota[i] > 60 && nota[i] <= 80) {
                conceito = "B";
            } else {
                conceito = "A";
            }

            System.out.print(", Conceito: " + conceito);
            System.out.println();
        }

        console.close();
    }
}
