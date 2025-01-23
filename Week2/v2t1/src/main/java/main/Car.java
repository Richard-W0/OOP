package main;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
}
    public void Status(String merkki, String malli, int nopeus){
        System.out.println("Auto: " +merkki+ " " +malli+ ", Nopeus: " +nopeus+ " km/h");
    }
    public void SetCar(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public void SetSpeed(int speed){
        if (speed < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        } else{
        this.speed += speed;
        }
    }
    public void lowerSpeed(int speed){
        if (speed < 0) {
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        } else if (speed > this.speed){
            this.speed = 0;
        } else{
            this.speed -= speed;
        }

        
    }
}