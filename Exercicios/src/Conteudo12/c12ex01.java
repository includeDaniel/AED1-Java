package Conteudo12;

import java.util.Scanner;

public class c12ex01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[10], contador = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite valores númericos inteiros: ");
            n[i] = console.nextInt();

            if (n[i] % 5 == 0 && n[i] % 7 == 0) {
                contador++;
            }
        }
        System.out.println(contador);
        console.close();
    }
}
