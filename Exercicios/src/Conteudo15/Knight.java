package Conteudo15;

public class Knight extends Character {
    private double energy;
    private double sword;

    public Knight(String name, double HP, double attack, double defense, double energy, double sword) {
        super(name, HP, attack, defense);
        this.energy = energy;
        this.sword = sword;
    }

    public void getEnergy() {
        System.out.println(this.energy);
    }

    public void getSword() {
        System.out.println(this.sword);
    }

    public void setAtributes(double newEnergy, double newSword) {
        this.energy = newEnergy;
        this.sword = newSword;
    }
}
