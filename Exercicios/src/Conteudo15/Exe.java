package Conteudo15;

import java.util.Scanner;

public class Exe {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("FirstCharacter: ");
        Character FirstCharacter = new Character("Stevan", 1200, 500);
        FirstCharacter.getCharacter();

        System.out.println();

        System.out.println("SecondCharacter: ");
        Character SecondCharacter = new Character("Coole", 800, 250);
        SecondCharacter.getCharacter();

        System.out.println();
        FirstCharacter.setCharacter("Káká", 222, 142);
        FirstCharacter.getCharacter();
    }
}
