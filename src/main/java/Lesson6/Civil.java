package Lesson6;

import java.util.Scanner;

public class Civil extends AirTransport {
    int numberPassengers;
    boolean businessClass;
    Scanner sc = new Scanner(System.in);
    public double powerkw;

    public void civilBoing() {
        power = 30000;
        maxSpeed = 1000;
        weight = 200000;
        carBrand = "Boing";
        numberPassengers = 300;
        businessClass = true;
        powerInKW();
        wingspan = 65;
        minLengthRunway = 2.5;
        System.out.printf("Power: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s, Number of passengers: %d," +
                        " Business class: %b, Power in kW: %s, Wingspan: %d m, Min length runway: %s km\n",
                power, maxSpeed, weight, carBrand, numberPassengers, businessClass, powerkw, wingspan, minLengthRunway);
    }

    private void powerInKW() {
        powerkw = power * 0.74;
    }

    public void passenger() {
        System.out.println("Enter the number of passengers:");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("ERROR");
        } else if (number <= 300) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
