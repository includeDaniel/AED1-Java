package Conteudo11;

import java.util.Scanner;

public class c11ex13 {
    public static void main(String[] args) {
        int cont = 0, term = 1, rep;
        double num, den, serie = 0, result;
        Scanner console = new Scanner(System.in);
        System.out.print("digite o número de reps: ");
        rep = console.nextInt();
        do {
            cont++;
            term += 9.0;

            num = cont * (Math.pow(term, cont * 2.0));
            den = Math.pow(7, (cont - 1.0));

            serie += num / den;

            System.out.println(cont);

        } while (cont != rep);
        result = 71 + (Math.cbrt(serie));
        System.out.println(result);
    }
}
