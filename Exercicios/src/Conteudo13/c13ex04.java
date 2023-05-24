package Conteudo13;

import java.util.Scanner;

public class c13ex04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n, r, cont = 0;

        n = GeraAleatorio();
        System.out.print("Tente adivinhar o número entre 0 e 100: ");
        r = console.nextInt();
        System.out.println();
        do {
            if (r == n) {

            } else {
                if (r > n) {
                    System.out.println("Está acima do número");
                } else {
                    System.out.println("Está abaixo do número");
                }
                System.out.println("Tente novamente: ");
                r = console.nextInt();
                System.out.println();
                cont++;
            }
        } while (r != n);
        System.out.println("Você acertou!");
        System.out.println("Foram " + cont + " tentativas");

        console.close();
    }

    public static int GeraAleatorio() {
        // gera aleatorio de 0 a 100
        double n1 = Math.floor(Math.random() * 101);
        int n = (int) n1;

        return n;
    }

}
