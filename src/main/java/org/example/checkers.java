package org.example;

import java.util.Scanner;

public class checkers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("n:");
        int n = scn.nextInt();

        int[][] duru = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    duru[i][j] = 1;
                } else {
                    duru[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-3d ", duru[i][j]);
            }
            System.out.println();
        }

        scn.close();
    }
}
