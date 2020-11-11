package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter size of multidimensional array n & m:");
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
        int product1 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    product1 *= array[i][j];
                }
            }
        }
        System.out.println("Product of the main diagonal elements: " + product1);
        int product2 = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    product2 *= array[i][j];
                }
            }
        }
        System.out.println("Product of the elements of the side diagonal: " + product2);
        System.out.println(product1 > product2 ? "Product of the main diagonal elements > Product of the elements" +
                " of the side diagonal" : "Product of the elements of the side diagonal > " +
                "Product of the main diagonal elements");
    }
}