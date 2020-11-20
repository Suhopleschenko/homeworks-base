package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        start();

    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?: \n1 - show parameters of laptop \n2 - turn on laptop \n3 - turn off laptop");
        int a = sc.nextInt();
        if (a < 1 || a > 3) {
            System.out.println("ERROR");
            start();
        }
        if (a == 1) {
            Laptop.parametersOfComputer();
        }
        if (a == 2 && Laptop.turnOn == false && Laptop.bernOut == false) {
            Laptop.loadingLaptop();
        } else if (a == 2 && Laptop.bernOut == true) {
            System.out.println("Computer burned out!");
            start();
        } else if (a == 2 && Laptop.turnOn == true) {
            System.out.println("Computer is already ON.");
            start();
        }
        if (a == 3 && Laptop.turnOn == false && Laptop.bernOut == false) {
            System.out.println("Laptop is already OFF");
            start();
        } else if (a == 3 && Laptop.bernOut == true && Laptop.turnOn == true) {
            System.out.println("useless, it's already burned out!");
            start();
        } else if (a == 3 && Laptop.turnOn == true) {
            Laptop.shutdownLaptop();
            start();
        } else if (a == 3 && Laptop.bernOut == true) {
            System.out.println("Computer burned out!");
            start();
        }
    }
}
