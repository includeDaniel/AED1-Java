package Conteudo6;

import java.util.Scanner;

public class c06ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int faltas, idade, peso1, peso2;
        double nota1, nota2, nota3, maiorNota1, maiorNota2, notaTrabalho, notaFinal;
        String diagnostico;
        System.out.print("Digite o número de faltas do aluno: ");
        faltas = teclado.nextInt();
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = teclado.nextDouble();
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = teclado.nextDouble();
        System.out.print("Digite a nota do trabalho final: ");
        notaTrabalho = teclado.nextDouble();
        System.out.print("Digite a idade do aluno: ");
        idade = teclado.nextInt();

        // Descobrindo maiores 2 notas
        if (nota1 > nota2 && nota2 > nota3) {
            maiorNota1 = nota1;
            maiorNota2 = nota2;
        } else if (nota1 > nota2 && nota2 < nota3) {
            maiorNota1 = nota1;
            maiorNota2 = nota3;
        } else if (nota1 < nota2 && nota1 > nota3) {
            maiorNota1 = nota2;
            maiorNota2 = nota1;
        } else if (nota1 < nota2 && nota1 < nota3) {
            maiorNota1 = nota2;
            maiorNota2 = nota3;
        } else if (nota1 > nota2 && nota3 > nota1) {
            maiorNota1 = nota3;
            maiorNota2 = nota1;
        } else {
            maiorNota1 = nota3;
            maiorNota2 = nota2;
        }

        // Descobrindo o valor do peso1
        if (faltas <= 5) {
            peso1 = 3;
        } else if (faltas > 5 && faltas <= 10) {
            peso1 = 2;
        } else {
            peso1 = 1;
        }

        // Descobrindo o valor do peso2
        if (idade <= 17) {
            peso2 = 1;
        } else if (idade > 17 && idade <= 50) {
            peso2 = 2;
        } else {
            peso2 = 3;
        }

        notaFinal = ((maiorNota1 + maiorNota2) / 2) * peso1 + notaTrabalho * peso2;

        // Diagnóstico de do aluno
        if (notaFinal <= 50) {
            diagnostico = "Reprovado";
        } else if (notaFinal > 50 && notaFinal <= 70) {
            diagnostico = "Regular";
        } else if (notaFinal > 70 && notaFinal <= 80) {
            diagnostico = "Bom";
        } else if (notaFinal > 80 && notaFinal <= 90) {
            diagnostico = "Muito Bom";
        } else {
            diagnostico = "Excelente";
        }

        System.out.print("\n\nA nota final do aluno: " + notaFinal + "\nO diagnóstico dele foi: " + diagnostico + "\n\n");
        teclado.close();
    }
}
