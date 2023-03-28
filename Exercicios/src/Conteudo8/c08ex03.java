package Conteudo8;

import java.util.Scanner;

public class c08ex03 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cont1 = 0, cont2 = 0;
        for(int i = 1; i <= 3; i++) {
            System.out.print("\nDigite a nota final do aluno " + i + ": ");
            Double n1 = console.nextDouble();
            if (n1 <= -1 ) {
                break;
            }
            System.out.print("Digite o total de faltas do aluno" + i + ": ");
            Double faltas = console.nextDouble();
            if(n1 >= 65 && faltas <= 16) {
                System.out.print("\nAPROVADO");
                cont1++;
            } else {
                System.out.print("\nREPROVADO");
                cont2++;
            }
            System.out.print("\n\nNúmero de alunos aprovados: " + cont1);
            System.out.print("\nNúmero de alunos reprovados: " + cont2);
        }
        console.close();
    }

  
}
