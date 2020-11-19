package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int processor = 4;
        int ram = 8;
        int ssd = 512;
        int numberOfCycle = 5;
        System.out.println("Что вы хотите сделать: 1 - вывести параметры компа " +
                "2 - включить комп " +
                "3 - выключить комп");
        int a = sc.nextInt();
        if (a < 1 || a > 3) {
            System.out.println("Error");
        }
        if (a == 1) {
            System.out.printf("Processor: 8 core %d GHz, RAM: %d GB, SSD: %d GB \n", processor, ram, ssd);
        }
        if (a == 2) {
            int b = r.nextInt(11);
            System.out.println(b);
            if (b > 4) {
                int c = r.nextInt(2);
                System.out.println("Error. Enter 1 or 0");
                int n = sc.nextInt();
                int userEnter = 0;
                if (c == n) {
                    while (userEnter == 0) {
                        System.out.println("Computer is working. Do you want to turn it off? 1 - YES 0 - NO");
                        userEnter = sc.nextInt();
                    }
                } else {
                    System.out.println("ALARM! Computer burned out!");
                }
            }
        }
    }
}
