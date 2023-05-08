//Daniel Nunes da Silva
package Conteudo11;

import java.util.Scanner;

public class D21498A {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = 1, n, cont = 0;
        double y = 0, w = 0, soma = 0, media = 0;
        System.out.print("Digite o valor de x: ");
        n = console.nextInt();
        console.close();
        for(int i = 1; i <= n; i++) {
            y = 4 * Math.pow(x, 3) - 13 * x + 2;
            w = 10 * y - Math.pow(6*x - 1, 1/7.0);

            System.out.println(x);
            System.out.println(y);
            System.out.println(w);

            x++;

            if( w > 1000) {
                cont++;
                soma += w;
            }
        }
        media = soma / cont; 
        System.out.println("media de w: " + media);

    }
}
