package Conteudo15;

import java.util.Scanner;

public class Exe {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Mage Mage = new Mage("Gandalf", 600, 1000, 250, 500, 1.5);
        Knight Knight = new Knight("Jaime Lannister", 800, 800, 1000, 700, 1.2);
    }
}
