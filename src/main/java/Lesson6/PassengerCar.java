package Lesson6;

import java.util.Scanner;

public class PassengerCar extends Mechanisms.Transport {
    Scanner sc = new Scanner(System.in);
    String bodyType;
    int numberPassengers;
    public double powerkw;
    public double spentFuel;
    public double time;

    public void passengerCar() {
        power = 200;
        maxSpeed = 220;
        weight = 2000;
        carBrand = "Audi";
        bodyType = "sedan";
        numberPassengers = 5;
        powerInKW();
        System.out.printf("Power: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s, Type: %s, Number of passengers: %d, Power in kW: %s\n",
                power, maxSpeed, weight, carBrand, bodyType, numberPassengers, powerkw);
    }

    public void powerInKW() {
        powerkw = power * 0.74;
    }

    private void fuel() {
        LandTransport.fuelConsumption = 12;
        spentFuel = time * maxSpeed / 100 * LandTransport.fuelConsumption;
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
