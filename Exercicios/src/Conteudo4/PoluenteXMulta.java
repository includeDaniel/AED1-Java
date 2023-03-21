package Conteudo4;

import java.util.Scanner;

public class PoluenteXMulta {
    // Quantidade de poluente emitido x Valor de Multa
    public static void main(String[] args) {
        long qntPoluentes1, qntPoluentes2;
        double valor1, valor2, valor3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de poluentes: ");
        qntPoluentes1 = teclado.nextLong();
        System.out.print("Digite o valor da multa para a quantidade dos primeiros poluentes: ");
        valor1 = teclado.nextDouble();
        System.out.print("Digite a segunda quantidade de poluentes: ");
        qntPoluentes2 = teclado.nextLong();
        System.out.print(
                "Digite o valor da multa dos poluentes acima de " + qntPoluentes1 + " ate " + qntPoluentes2 + ": ");
        valor2 = teclado.nextDouble();
        System.out.print("Digite o valor da multa acima de " + qntPoluentes2 + ": ");
        valor3 = teclado.nextDouble();
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();
        System.out.print("----------Quantidade de Poluente Emitdo x Valor da Multa------------");
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();
        System.out.print("Até " + qntPoluentes1 + " multa de R$ " + valor1);
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();
        System.out.print("Acima de " + qntPoluentes1 + " e " + qntPoluentes2 + " multa de R$" + valor2);
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();
        System.out.print("Acima de " + qntPoluentes2 + " multa de R$ " + valor3 + " por poluente emitido ");
        System.out.println();
        System.out.print("--------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        teclado.close();
    }
}
