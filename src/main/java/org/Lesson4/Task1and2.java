package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter size of multidimensional array N & M:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = r.nextInt(51);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j && array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of even elements: " + sum); // main diagonal
        int sum1 = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j + 1 && array[i][j] % 2 != 0) {
                    sum1 += array[i][j];
                }
            }
        }
        System.out.println("Sum of odd elements: " + sum1); // under the main diagonal
    }
}