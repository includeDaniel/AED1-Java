package Conteudo6;

import java.util.Scanner;

public class c06ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu salário: ");
        double salario = teclado.nextDouble();
        if (salario <= 300) {
            double PLbruto = 500 + (salario * 70 / 100);
            double impostoRenda = (PLbruto * 25 / 100);
            double PLliquido = PLbruto - impostoRenda;
            System.out.printf("PL Líquido: %.2f", PLliquido);
        } else if (salario > 300 && salario <= 1000) {
            double PLbruto = 200 + (salario * 50 / 100);
            double impostoRenda = (PLbruto * 25 / 100);
            double PLliquido = PLbruto - impostoRenda;
            System.out.printf("PL Líquido: %.2f", PLliquido);
        } else {
            double PLbruto = (salario * 30 / 100);
            double impostoRenda = (PLbruto * 25 / 100);
            double PLliquido = PLbruto - impostoRenda;
            System.out.printf("PL Líquido: %.2f", PLliquido);
        }
        teclado.close();

    }
}
