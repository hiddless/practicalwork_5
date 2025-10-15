package org.example;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("n: ");
        int n = scn.nextInt();

        int[][] duru = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                duru[i][j] = n * j + (n - 1 - i);
            }
        }
        for (int i = 0; i < duru.length; i++) {
            for (int j = 0; j < duru[i].length; j++) {
                System.out.printf("%-3d ", duru[i][j]);
            }
            System.out.println();
        }

        scn.close();

    }
}
