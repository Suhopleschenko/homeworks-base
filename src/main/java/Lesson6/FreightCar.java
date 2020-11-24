package Lesson6;

import java.util.Scanner;

public class FreightCar extends LandTransport {
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
        numberOfWheels = 10;
        System.out.printf("\nPower: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s, Lifting capacity: %d tons," +
                        " Power in kW: %s, Number of wheels %d\n",
                power, maxSpeed, weight, carBrand, liftingCapacity, powerkw, numberOfWheels);
    }

    private void powerInKW() {
        powerkw = power * 0.74;
    }

    public void cargo() {
        System.out.println("Enter cargo weight in tons:");
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
