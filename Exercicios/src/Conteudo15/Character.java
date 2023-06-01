package Conteudo15;

public class Character {
    private String name;
    private double HP;
    private double energy;

    public Character(String name, double HP, double energy) {
        this.name = name;
        this.HP = HP;
        this.energy = energy;
    }

    public void getCharacter() {
        System.out.println("Nome: " + this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("Energy: " + this.energy);
    }
}
