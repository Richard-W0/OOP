package main;

import java.io.Serializable;

public class Player implements Serializable {
    String name;
    int damage;

    public Player(String name)

    {
        this.name = name;
        this.damage = 10;
    }

    public Boolean Attack(Monster target) {
        System.out.println(this.name + "hyökkää" + target.type + " hirviöön!");
        target.takeDamage(this.damage);
        if (target.health <= 0) {
            System.out.println(target.type + " on kuollut!");
            return true;
        } else {
            System.out.println("Hirviöllä on " + target.health + " elämää jäljellä.");
            return false;
        }
    }
}
