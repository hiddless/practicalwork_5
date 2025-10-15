package org.example;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("rows: ");
        int r = scn.nextInt();

        System.out.print("columns: ");
        int c = scn.nextInt();

        int[][] d = new int[r][c];
        int num = 1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = num++;
            }
        }

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.printf("%-3d ", d[i][j]);
            }
            System.out.println();
        }

        scn.close();
    }
}
