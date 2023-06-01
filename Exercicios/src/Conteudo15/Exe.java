package Conteudo15;

public class Exe {
    public static void main(String[] args) {
        System.out.println("FirstCharacter: ");
        Character FirstCharacter = new Character("Stevan", 1200, 500);
        FirstCharacter.getCharacter();

        System.out.println();

        System.out.println("SecondCharacter: ");
        Character SecondCharacter = new Character("Coole", 800, 250);
        SecondCharacter.getCharacter();
    }
}
