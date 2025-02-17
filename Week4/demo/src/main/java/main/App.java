package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Syötä pelaajan nimi: ");
        String name = input.nextLine();
        Player player = new Player(name);
        Cave cave = new Cave(player);
        Boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää luolaan hirviö");
            System.out.println("2) Listaa hirviöt");
            System.out.println("3) Hyökkää hirviöön");
            System.out.println("4) Tallenna peli");
            System.out.println("5) Lataa peli");
            System.out.println("0) Lopeta peli");
            String valinta = input.nextLine();
            int numero = Integer.parseInt(valinta);
            switch (numero) {
                case 1:
                    System.out.println("Anna hirviön tyyppi: ");
                    String tyyppi = input.nextLine();
                    System.out.println("Anna hirviön elämän määrä numerona: ");
                    String health = input.nextLine();
                    int hp = Integer.parseInt(health);
                    Monster monster = new Monster(tyyppi, hp);

                    cave.addMonster(monster);
                    break;
                case 2:
                    if (!cave.monsterFolder.isEmpty()) {
                        System.out.println("Luolan hirviöt:");
                    }
                    cave.listMonsters();
                    break;
                case 3:
                    if (!cave.monsterFolder.isEmpty()) {
                        System.out.println("Valitse hirviö, johon hyökätä:");
                    }
                    cave.listMonsters();
                    String strTarget = input.nextLine(); // hungarian notation still not outdated
                    int target = Integer.parseInt(strTarget);
                    Boolean dead = cave.player.Attack(cave.monsterFolder.get(target - 1));
                    if (dead) {
                        cave.monsterFolder.remove(target - 1);
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    exit = true;
                    System.out.println("Peli päättyy. Kiitos pelaamisesta!");

            }
        }
    }
}
