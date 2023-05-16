package Conteudo12;

import java.util.Scanner;

public class c12ex22 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n[] = new int[20];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite um número inteiro: ");
            n[i] = console.nextInt();
        }
        console.close();
        for (int i = 0; i < n.length; i++) {
            if((i + 1)% 2 != 0 ) {
                System.out.print(n[i] + " ");  
            }
        }
        for (int i = 0; i < n.length; i++) {
            if((i + 1)% 2 == 0 ) {
                System.out.print(n[i] + " ");  
            }
        }

    }
}
