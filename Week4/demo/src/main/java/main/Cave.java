package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Cave implements Serializable {
    Player player;
    ArrayList<Monster> monsterFolder;

    public Cave(Player player) {
        this.player = player;
        this.monsterFolder = new ArrayList();
    }

    public void addMonster(Monster monster) {
        this.monsterFolder.add(monster);
    }

    public void listMonsters() {
        if (this.monsterFolder.isEmpty()) {
            System.out.println("Luola on tyhjä.");
        } else {
            for (Monster monster : monsterFolder) {
                System.out.println(monster);
            }
        }

    }
}
