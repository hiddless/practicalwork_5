package org.example;

import java.util.Scanner;

public class task_numbers_snake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("row: ");
        int row = scn.nextInt();
        System.out.println("col: ");
        int col = scn.nextInt();

        int[][] d=new int[row][col];
        int n= 1;
        for(int i=0; i<row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    d[i][j] = n++;
                }
            }else{
                    for (int j = 0; j < col; j++) {
                        d[i][j] = n++;
                    }
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


