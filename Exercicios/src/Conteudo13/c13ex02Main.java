package Conteudo13;

import java.util.Scanner;
import Conteudo13.c13ex02Method;

public class c13ex02Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = 0, resultado = 0;
        do {
            System.out.print("Digite o valor de x:(Digite '-1' para parar a repetição) ");
            x = console.nextDouble();
            if (x == -1) {

            } else {

                resultado = c13ex02Method.CalculaExpressao(x);
                System.out.println(resultado);
            }

        } while (x != -1);
        console.close();
    }
}