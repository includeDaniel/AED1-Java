package Conteudo13;

import java.util.Scanner;

public class c13ex09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String f;

        System.out.println("Digite um nome completo: ");
        f = console.nextLine();

        String[] array = f.split("");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toUpperCase());
        }

        console.close();
    }
}
