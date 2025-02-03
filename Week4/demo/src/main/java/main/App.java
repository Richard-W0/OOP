package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean exit = false;
        while (!exit) {
            System.out.println("Syötä pelaajan nimi: ");
            String name = input.nextLine();
            System.out.println("1) Lisää luolaan hirviö");
            System.out.println("2) Listaa hirviöt");
            System.out.println("3) Hyökkää hirviöön");
            System.out.println("4) Tallenna peli");
            System.out.println("5) Lataa peli");
            System.out.println("0) Lopeta peli");
        }
    }
}
