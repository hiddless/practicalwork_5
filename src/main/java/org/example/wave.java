package org.example;

import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();

        int[][] duru = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diff = Math.abs((i - j) % 4);
                if (diff > 3) diff = 6 - diff;
                duru[i][j] = diff;
            }
        }
        for (int i = 0; i < duru.length; i++) {
            for (int j = 0; j < duru[i].length; j++) {
                System.out.printf("%-3d ", duru[i][j]);
            }
            System.out.println();
        }

    }
}
