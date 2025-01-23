package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Anna auton merkki: ");
        String merkki = input.nextLine();
        System.out.print("Anna auton malli: ");
        String malli = input.nextLine();
        Car auto = new Car(merkki, malli);
        boolean exit = false;
        while(!exit){
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");
            String valinta = input.nextLine();
            int i;
            i = Integer.parseInt(valinta);
            switch (i) {
                case 1:
                    auto.Status(auto.brand, auto.model, auto.speed);
                    break;
                case 2:
                    System.out.print("Anna uusi auton merkki: ");
                    String newBrand = input.nextLine();
                    System.out.print("Anna uusi auton malli: ");
                    String newModel = input.nextLine();
                    auto.SetCar(newBrand, newModel);
                    break;
                case 3:
                    System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                    String newSpeed = input.nextLine();
                    int s;
                    s = Integer.parseInt(newSpeed);
                    auto.SetSpeed(s);
                    break;
                case 4:
                    System.out.print("Kuinka monta km/h haluat hidastaa? ");
                    String lSpeed = input.nextLine();
                    int l;
                    l = Integer.parseInt(lSpeed);
                    auto.lowerSpeed(l);
                    break;
                case 0:
                    exit = true;
                    System.out.print("Kiitos ohjelman käytöstä.");
                    break;
            }

        }

    }
}
