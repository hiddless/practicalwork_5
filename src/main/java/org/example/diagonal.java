package org.example;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);

      System.out.print("n: ");
      int n = scn.nextInt();

      int[][] duru = new int[n][n];
      int k = 1;

      for (int i = 0; i < n; i++) {
          for (int j = n - 1; j >= 0; j--) {
              if (i + j >= n - 3 && i + j <= n - 1) {
                        duru[i][j] = k++;
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
