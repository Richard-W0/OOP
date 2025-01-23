package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Safe safe = new Safe("0000");
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Aseta PIN-koodi");
            System.out.println("2) Lisää tietoja kansioon");
            System.out.println("3) Listaa tiedot kansiosta");
            System.out.println("0) Lopeta ohjelma");
            String valinta = input.nextLine();
            int numero;
            numero = Integer.parseInt(valinta);
            switch (numero) {
                case 1:
                    System.out.println("Anna uusi PIN-koodi:");
                    String inputPin = input.nextLine();
                    safe.changePin(inputPin);
                    break;
                case 2:
                    System.out.println("Anna kansioon lisättävä tieto:");
                    String newElement = input.nextLine();
                    safe.addToList(newElement);
                    break;
                case 3:
                    System.out.println("Anna PIN-koodi:");
                    String inputCode = input.nextLine();
                    try {
                        ArrayList<String> content = safe.getContent(inputCode);
                        for (int i = 0; i < content.size(); i++) {
                            String print = content.get(i);
                            System.out.println(print);
                        }
                    } catch (Exception e) {
                        System.out.println("Väärä PIN-koodi!");
                    }
                    break;
                case 0:
                    exit = true;
            }
        }
    }
}
