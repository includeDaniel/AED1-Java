package Conteudo8;

import java.util.Scanner;

public class c08ex08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cont1 = 0, cont3 = 0, soma = 0;
        double media;
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nDigite a nota final do aluno " + i + ": ");
            Double n1 = console.nextDouble();
            if (n1 <= -1) {
                break;
            }
            System.out.print("Digite o total de faltas do aluno " + i + ": ");
            Double faltas = console.nextDouble();

            if (n1 >= 65 && faltas <= 16) {
                System.out.print("\nAPROVADO");
                soma += n1;
                cont1++;
            } else {
                System.out.print("\nREPROVADO");
            }

            if (faltas > 16) {
                cont3++;
            }

        }
        media = (float) soma / cont1;
        System.out.print("\nMédia dos alunos aprovados: " + media + "\n");
        System.out.print("Quantidade de alunos com mais de 16 faltas: " + cont3 + "\n");
        console.close();
    }
}
