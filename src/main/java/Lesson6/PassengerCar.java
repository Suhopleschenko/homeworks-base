package Lesson6;

import java.util.Scanner;

public class PassengerCar extends LandTransport {
    Scanner sc = new Scanner(System.in);
    String bodyType;
    int numberPassengers;
    public double powerkw;
    public static double time;
    public static double spentFuel;

    public void passengerCar() {
        power = 200;
        maxSpeed = 220;
        weight = 2000;
        carBrand = "Audi";
        bodyType = "sedan";
        numberPassengers = 5;
        powerInKW();
        numberOfWheels = 4;
        System.out.printf("Power: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s, Type: %s, Number of passengers: %d," +
                        " Power in kW: %s, Number of wheels: %d\n",
                power, maxSpeed, weight, carBrand, bodyType, numberPassengers, powerkw, numberOfWheels);
    }

    private void powerInKW() {
        powerkw = power * 0.74;
    }

    private void fuel() {
        fuelConsumption = 12;
        spentFuel = time * maxSpeed / 100 * fuelConsumption;
    }

    public void road() {
        System.out.println("Enter time");
        time = sc.nextDouble();
        fuel();
        System.out.printf("За время " + time + " ч, автомобиль " + carBrand +
                "\nдвигаясь с максимальной скоростью " + maxSpeed + " км/ч" +
                "\nпроедет " + maxSpeed * time + " км и израсходует " + spentFuel + " литров топлива.\n");
    }
}
