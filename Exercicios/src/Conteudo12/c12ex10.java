package Conteudo12;

import java.util.Scanner;

public class c12ex10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome[] = new String[8];
        double nota[] = new double[8], soma = 0, media = 0;
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = console.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = console.nextDouble();
            console.nextLine();
            soma += nota[i];
        }
        media = soma / nota.length;
        System.out.println("Nome dos alunos que tiveram a nota acima da média: ");
        for (int i = 0; i < nome.length; i++) {
            if (nota[i] > media) {
                System.out.println(nome[i]);
            }
        }

        console.close();
    }
}
