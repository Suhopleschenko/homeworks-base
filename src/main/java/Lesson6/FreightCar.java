package Lesson6;

import java.util.Scanner;

public class FreightCar extends Mechanisms.Transport {
    Scanner sc = new Scanner(System.in);
    int liftingCapacity;
    public double powerkw;

    public void freightCar() {
        power = 350;
        maxSpeed = 110;
        weight = 7000;
        carBrand = "Scania";
        liftingCapacity = 50;
        powerInKW();
        System.out.printf("Power: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s, Lifting capacity: %d t, Power in kW: %s\n",
                power, maxSpeed, weight, carBrand, liftingCapacity, powerkw);
    }

    public void powerInKW() {
        powerkw = power * 0.74;
    }

    public void cargo() {
        System.out.println("Enter lifting capacity");
        int lifting = sc.nextInt();
        if (lifting < 0) {
            System.out.println("ERROR");
        } else if (lifting <= 50) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
