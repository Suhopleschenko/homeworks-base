package Lesson6;

import java.util.Scanner;

public class Military extends AirTransport {
    boolean ejectionSystem;
    int numberOfMissiles;
    Scanner sc = new Scanner(System.in);
    public double powerkw;

    public void su35() {
        System.out.println("Enter number of missiles:");
        power = 70000;
        maxSpeed = 1400;
        weight = 15000;
        carBrand = "SU35";
        ejectionSystem = true;
        numberOfMissiles = sc.nextInt();
        powerInKW();
        wingspan = 15;
        minLengthRunway = 0.5;
        if (numberOfMissiles < 0) {
            System.out.println("Error");
        } else {
            System.out.printf("Power: %d hp, MaxSpeed: %d km/h, Weight: %d Kg, Car brand: %s," +
                            " Ejection system: %b, Number of missiles: %d, Power in kW: %s, Wingspan: %d m, Min length runway: %s km\n",
                    power, maxSpeed, weight, carBrand, ejectionSystem, numberOfMissiles, powerkw, wingspan, minLengthRunway);
        }
    }

    private void powerInKW() {
        powerkw = power * 0.74;
    }

    public void missiles() {
        for (int i = numberOfMissiles; i > 0; i--) {
            System.out.println("Ракета пошла");
            numberOfMissiles--;
        }
        if (numberOfMissiles == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
