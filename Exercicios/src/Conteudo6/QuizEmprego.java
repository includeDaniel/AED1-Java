package Conteudo6;

import java.util.Scanner;

public class QuizEmprego {
    public static void main(String[] args) {
        String r1, r2, r3, r4, r5, r6, r7, r8, r9;
        // Condições para a contratação:
        // 4) V;
        // 6) F;
        // 7) V;
        // 9) F;
        Scanner teclado = new Scanner(System.in);
        // Quiz
        System.out.println("==========  Responda Com ( V ) ou ( F )");
        System.out.println("\n\nVocê tem curso técnico de programação? ");
        r1 = teclado.nextLine();
        System.out.println("Você tem curso superior de programação? ");
        r2 = teclado.nextLine();
        System.out.println("Você tem menos de 3 anos de experiência em programação? ");
        r3 = teclado.nextLine();
        System.out.println("Você se considera uma pessoa criativa? ");
        r4 = teclado.nextLine();
        System.out.println("Você prefere liderar a ser liderado? ");
        r5 = teclado.nextLine();
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        r6 = teclado.nextLine();
        System.out.println("Você é autodidata (aprende sozinho)? ");
        r7 = teclado.nextLine();
        System.out.println("Você aceitaria uma remuneração inicial de R$1500? ");
        r8 = teclado.nextLine();
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        r9 = teclado.nextLine();

        if (r4.equalsIgnoreCase("V") && r6.equalsIgnoreCase("F") &&
                r7.equalsIgnoreCase("V") && r9.equalsIgnoreCase("F")) {
            if (r1.equalsIgnoreCase("V") && r2.equalsIgnoreCase("F") &&
                    r3.equalsIgnoreCase("V")) {
                System.out.print("Não Está apto(a) a exercer a função de programador na empresa");
            } else if (r5.equalsIgnoreCase("V") && r8.equalsIgnoreCase("V")) {
                System.out.print("Não Está apto(a) a exercer a função de programador na empresa");
            } else {
                System.out.print("Está apto(a) a exercer a função de programador na empresa");
            }
        } else {
            System.out.print("\n\nNão Está apto(a) a exercer a função de programador na empresa");
        }
        teclado.close();
    }

}
