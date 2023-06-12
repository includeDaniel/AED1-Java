package Conteudo15;

import java.util.Scanner;

public class Exe {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        setWarriors();
    }

    public static void setWarriors() {
        Knight TheKnight = new Knight("", 0, 0, 0, 0, 0);
        Mage TheMage = new Mage("", 0, 0, 0, 0, 0);

        String name;
        double hp, attack, defense, attribute1, attribute2;
        int n;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Knight - 1 | Mage - 2");
            n = console.nextInt();
            console.nextLine();
            System.out.println("Name: ");
            name = console.nextLine();
            System.out.println("Healthy Points: ");
            hp = console.nextDouble();
            System.out.println("Attack Points: ");
            attack = console.nextDouble();
            System.out.println("Defense Points: ");
            defense = console.nextDouble();
            System.out.println("Mage -> Mana: | Knight -> Energy: ");
            attribute1 = console.nextDouble();
            System.out.println("Mage -> staff damage indicator: | Knight -> sword damage indicator: ");
            attribute2 = console.nextDouble();

            switch (n) {
                case 1 -> {
                    TheKnight.setCharacter(name, hp, attack, defense);
                    TheKnight.setAtributes(attribute1, attribute2);
                }
                case 2 -> {
                    TheMage.setCharacter(name, hp, attack, defense);
                    TheMage.setAtributes(attribute1, attribute2);
                }
            }
        }
    }
}
