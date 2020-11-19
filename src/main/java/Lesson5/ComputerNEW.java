package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class ComputerNEW {
    public static void main(String[] args) {
        //String one =  Laptop.parameterOfComputer();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int processor = 4;
        int ram = 8;
        int ssd = 512;
        int numberOfCycle = 5;
        System.out.println("Что вы хотите сделать?: \n1 - вывести параметры компа \n2 - включить комп \n3 - выключить комп");
        int a = sc.nextInt();
        if (a == 1) {
            Laptop.parameterOfComputer();
        }
    }
}
