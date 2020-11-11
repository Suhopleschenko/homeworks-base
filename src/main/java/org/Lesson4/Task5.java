package Lesson4;
// транспонируем матрицу

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter size of multidimensional array N & M:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        int[][] array1 = new int[m][n];
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
        int a = 0;
        int b = 0;
        for (int j = 0; j < m && a < m; j++) {
            for (int i = 0; i < n && b < n; i++) {
                array1[a][b] = array[i][j];
                b++;
            }
            b = 0;
            a++;
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}