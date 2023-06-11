package Conteudo15;

public class Mage extends Character {
    private double mana;
    private double staff;

    public Mage(String name, double HP, double attack, double defense, double mana, double staff) {
        super(name, HP, attack, defense);
        this.mana = mana;
        this.staff = staff;
    }

    public void getMana() {
        System.out.println(this.mana);
    }

    public void getStaff() {
        System.out.println(this.staff);
    }
}
