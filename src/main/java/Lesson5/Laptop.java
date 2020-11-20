package Lesson5;


import java.util.Random;
import java.util.Scanner;

public class Laptop {
    private static int numberOfCycle = 0;
    public static boolean turnOn = false;
    public static boolean bernOut = false;
    public static void parametersOfComputer() {
        int processor = 4;
        int ram = 8;
        int ssd = 512;
        System.out.printf("Processor: 8 core %d GHz, RAM: %d GB, SSD: %d GB \n", processor, ram, ssd);
        Computer.start();
    }

    public static void loadingLaptop() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        turnOn = true;
        //int numberOfCycle = 0;
        int b = r.nextInt(11);
        System.out.println(b);
        if (bernOut == true || numberOfCycle > 5) {
            System.out.println("Computer burned out!");
        } else {
            if (b > 5) {                                                               // error
                int c = r.nextInt(2);
                System.out.println("Error. Enter 1 or 0");
                int n = sc.nextInt();
                if (c == n) {
                    System.out.println("Laptop turn off");
                    turnOn = false;
                    numberOfCycle++;
                    Computer.start();
                } else {
                    System.out.println("ALARM! Computer burned out!");
                    bernOut = true;
                    Computer.start();
                }
            } else {                                                            // working
                System.out.println("Computer is working.");
                turnOn = true;
                Computer.start();
            }
        }
    }

    public static void shutdownLaptop() {
        System.out.println("Laptop turn off");
        turnOn = false;
        numberOfCycle++;
    }
}