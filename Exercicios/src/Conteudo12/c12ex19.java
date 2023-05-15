package Conteudo12;

import java.util.Scanner;

public class c12ex19 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bilhete[] = new int[5], bilhetePremiado, pos = 0;
        for (int i = 0; i < bilhete.length; i++) {
            System.out.print("Digite o número do bilhete:(o número do bilhete tem 3 digitos) ");
            bilhete[i] = console.nextInt();
        }
        System.out.print("Digite o número do bilhete sorteado: ");
        bilhetePremiado = console.nextInt();

        for (int i = 0; i < bilhete.length; i++) {
            if (bilhete[i] == bilhetePremiado) {
                pos = i + 1;
            }
        }
        console.close();
        if (pos > 0) {
            System.out.println("Você foi premiado");
        } else {
            System.out.println("Você não foi premiado");
        }
    }
}
