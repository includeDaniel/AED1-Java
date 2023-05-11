package Conteudo12;

import java.util.Scanner;

public class c12ex11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome[] = new String[8], quemObteveMaiorNota = "";
        double nota[] = new double[8], maiorNota = 0;
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = console.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = console.nextDouble();
            console.nextLine();
            System.out.println();
        }
        for (int i = 0; i < nome.length; i++) {
            if (nota[i] > maiorNota) {
                maiorNota = nota[i];
                quemObteveMaiorNota = nome[i];
            }
        }
        System.out.print("Quem obteve maior nota foi: " + quemObteveMaiorNota);
        console.close();
    }
}
