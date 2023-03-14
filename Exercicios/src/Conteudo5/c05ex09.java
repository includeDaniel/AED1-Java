package Conteudo5;

import java.util.Scanner;

public class c05ex09 {
    public static void main(String[] args) {
        Scanner mediaPonderada = new Scanner(System.in);
        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = mediaPonderada.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = mediaPonderada.nextDouble();
        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = mediaPonderada.nextDouble();

        double somaDosPesos = 2.0 + 3.0 + 5.0;
        double mediaP = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / somaDosPesos);

        System.out.print("A média ponderada é: " + mediaP);
        mediaPonderada.close();
    }
}
