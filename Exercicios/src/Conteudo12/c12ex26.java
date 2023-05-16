package Conteudo12;

import java.util.Scanner;

public class c12ex26 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase, arr[];
        System.out.print("Type a phrase: ");
        phrase = console.nextLine();
        System.out.println();

        arr = phrase.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        console.close();
    }
}
