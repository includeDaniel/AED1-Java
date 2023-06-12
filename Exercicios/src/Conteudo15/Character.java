package Conteudo15;

public class Character {
    private String name;
    private double HP;
    private double attack;
    private double defense;

    public Character(String name, double HP, double attack, double defense) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return this.name;
    }

    public double getHp() {
        return this.HP;

    }

    public double getAttack() {
        return this.attack;

    }

    public double getDefense() {
        return this.defense;
    }

    public void Rest() {
        this.HP = this.HP + 200;
    }

    public void SwordsDance() {
        this.attack = this.attack + 1000;
    }

    public void setCharacter(String newName, double newHP, double attack, double defense) {
        this.name = newName;
        this.HP = newHP;
        this.attack = attack;
        this.defense = defense;
    }
}
