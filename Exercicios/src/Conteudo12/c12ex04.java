package Conteudo12;

import java.util.Scanner;

public class c12ex04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[20], lugar;
        for (int i = 0; i < n.length; i++) {
            lugar = i + 1;
            System.out.print("Digite o número do corredor que chegou em " + lugar + " lugar: ");
            n[i] = console.nextInt();
        }
        System.out.println();
        for (int j = 0; j <= 9 ; j++) {
            lugar = j + 1;
            System.out.println("largada " + lugar + " será " + n[j] + " com " + n[j + 10]);
        }
        System.out.println();
        console.close();
    }
}
