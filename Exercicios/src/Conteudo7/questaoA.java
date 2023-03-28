//Daniel Nunes da Silva
package Conteudo7;

import java.util.Scanner;

public class questaoA {
    public static void main(String[] args) {
        double x, f1, f2;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de x: ");
        x = teclado.nextDouble();
        f1 = Math.pow(x, 2.0)* (2.0/7.0) + (Math.cbrt(4.0 * Math.pow(x, 5.0) + 10.0) -3.0)  ;
        f2 = 5.0* x - 3.0 / (Math.sqrt(Math.sqrt(Math.cbrt(x - 1.0))) + 6.0*x - 1.0);

        System.out.print("Valor de f1(x): " +  f1 );
        System.out.print("Valor de f2(x): " + f2);

        teclado.close();
    }
}
