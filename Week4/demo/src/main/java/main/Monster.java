package main;

public class Monster {
    String type;
    int health;

    public Monster(String type, int Health) {
        this.type = type;
        this.health = Health;

    }

    public void printInfo(int number) {
        System.out.println(number + ": " + this.type + " / " + this.health + "HP");
    }

    public int takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health > 0) {
            return this.health;
        }
        this.health = 0;
        return 0;
    }
}
