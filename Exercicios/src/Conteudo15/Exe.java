package Conteudo15;

import java.util.Scanner;

public class Exe {
    static Scanner console = new Scanner(System.in);
    static Knight TheKnight = new Knight("", 0, 0, 0, 0, 0);
    static Mage TheMage = new Mage("", 0, 0, 0, 0, 0);

    public static void main(String[] args) {
        setWarriors();
        Battle();
    }

    public static void setWarriors() {
        String name;
        double hp, attack, defense, attribute1, attribute2;
        int n;
        System.out.println("---------------------KNIGHT X MAGE | SET 1 KNIGHT AND 1 MAGE---------------------");
        for (int i = 1; i <= 2; i++) {
            System.out.println();
            System.out.println("Knight - 1 | Mage - 2");
            n = console.nextInt();
            console.nextLine();
            System.out.print("Name: ");
            name = console.nextLine();
            System.out.print("Healthy Points: ");
            hp = console.nextDouble();
            System.out.print("Attack Points: ");
            attack = console.nextDouble();
            System.out.print("Defense Points: ");
            defense = console.nextDouble();
            System.out.print("Mage -> Mana: | Knight -> Energy: ");
            attribute1 = console.nextDouble();
            System.out.print("Mage -> staff damage indicator: | Knight -> sword damage indicator: ");
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

    public static void Battle() {
        int knightPoints = 0, magePoints = 0;

        if (TheKnight.getAttack() * TheKnight.getSword() > TheMage.getAttack() * TheMage.getStaff()) {
            knightPoints++;
        } else if (TheKnight.getAttack() * TheKnight.getSword() < TheMage.getAttack() * TheMage.getStaff()) {
            magePoints++;
        }

        if (TheKnight.getHp() > TheMage.getHp()) {
            knightPoints++;
        } else if (TheKnight.getHp() < TheMage.getHp()) {
            magePoints++;
        }

        if (TheKnight.getEnergy() > TheMage.getMana()) {
            knightPoints++;
        } else if (TheKnight.getEnergy() < TheMage.getMana()) {
            magePoints++;
        }

        if (TheKnight.getDefense() > TheMage.getDefense()) {
            knightPoints++;
        } else if (TheKnight.getDefense() < TheMage.getDefense()) {
            magePoints++;
        }
        System.out.println();
        if (knightPoints > magePoints) {
            System.out.println("The Knight: " + TheKnight.getName() + " WINS!!");
        } else if (knightPoints < magePoints) {
            System.out.println("The Mage: " + TheMage.getName() + " WINS!!");
        }
    }
}
