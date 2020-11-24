package Lesson6;

import java.util.Scanner;

public class Mechanisms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of transport: 1 - Audi, 2 - Scania, 3 - Boing, 4 - SU35");
        int n = sc.nextInt();
        if (n < 1 || n > 4) {
            System.out.println("ERROR");
        } else if (n == 1) {
            PassengerCar audi = new PassengerCar();
            audi.passengerCar();
            audi.road();
        } else if (n == 2) {
            FreightCar scania = new FreightCar();
            scania.freightCar();
            scania.cargo();
        } else if (n == 3) {
            Civil boing = new Civil();
            boing.civilBoing();
            boing.passenger();
        } else {
            Military su = new Military();
            su.su35();
            su.missiles();
            su.ejection();
        }
    }

    public static class Transport {
        int power;
        int maxSpeed;
        int weight;
        String carBrand;
    }
}
