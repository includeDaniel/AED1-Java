package Conteudo15;

public class Mage extends Character {
    private double mana;
    private double staff;

    public Mage(String name, double HP, double attack, double defense, double mana, double staff) {
        super(name, HP, attack, defense);
        this.mana = mana;
        this.staff = staff;
    }

    public double getMana() {
        return this.mana;
    }

    public double getStaff() {
        return this.staff;
    }

    public void setAtributes(double newMana, double newStaff) {
        this.mana = newMana;
        this.staff = newStaff;
    }
}
