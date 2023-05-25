package Conteudo13;

import java.util.Scanner;

public class c13ex10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String f;

        System.out.println("Digite um nome completo: ");
        f = console.nextLine();

        String[] array = f.split(" ", f.split(" ").length);

        for (int i = 0; i < array.length; i++) {
            String[] array2 = array[i].split("");
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array2[j].toUpperCase());
            }
            System.out.println(" ");
        }

        console.close();
    }
}
