package Conteudo11;

import java.util.Scanner;

public class c11ex05 {
    public static void main(String[] args) {
        String aluno;
        int codigo, cont = 0, rep = 0;
        double valorMensalidade = 0, valorMensalidadeTotal = 0, media = 0, totalMensalidadeIngles = 0,
                totalMensalidadeFrances = 0, totalMensalidadeEspanhol = 0;
        Scanner console = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        aluno = console.nextLine();
        while (!aluno.equalsIgnoreCase("FIM")) {
            System.out.print("Digite o código da opção: ");
            codigo = console.nextInt();
            console.nextLine();

            switch (codigo) {
                case 1 -> {
                    valorMensalidade = 100;
                }
                case 2 -> {
                    valorMensalidade = 150;
                }
                case 3 -> {
                    valorMensalidade = 120;
                }
            }

            if (codigo == 1) {
                cont++;
                totalMensalidadeIngles += valorMensalidade;
            }
            if (codigo == 2) {
                totalMensalidadeFrances += valorMensalidade;
            }
            if (codigo == 3) {
                totalMensalidadeEspanhol += valorMensalidade;
            }

            valorMensalidadeTotal += valorMensalidade;
            rep++;

            media = (float) valorMensalidadeTotal / rep;

            System.out.println();
            System.out.println("Aluno: " + aluno + ", valor da mensalidade: " + valorMensalidade);

            System.out.println();
            System.out.print("Digite o nome do aluno: ");
            aluno = console.nextLine();
            System.out.println();
        }
        System.out.println("A quanitdade de alunos matriculados em inglês é: " + cont);
        System.out.println("A mensalidade média: " + media);
        System.out.println("Total mensalidades inglês: " + totalMensalidadeIngles);
        System.out.println("Total mensalidades francês: " + totalMensalidadeFrances);
        System.out.println("Total mensalidades espanhol: " + totalMensalidadeEspanhol);
    }
}
