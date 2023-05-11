package Conteudo12;

import java.util.Scanner;

public class c12ex12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome[] = new String[3];
        double nota[] = new double[3], maiorNota = 0;

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = console.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = console.nextDouble();
            console.nextLine();
            System.out.println();
        }
        for (int i = 0; i < nome.length; i++) {
            if (nota[i] >= maiorNota) {
                maiorNota = nota[i];

            }
        }
        System.out.println("Quem obteve maior nota foi: ");
        for (int i = 0; i < nota.length; i++) {
            if(nota[i] == maiorNota) {
                System.out.println(nome[i]);
            }
        }

        console.close();
    }
}
