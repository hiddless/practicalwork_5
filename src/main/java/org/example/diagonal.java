package org.example;

import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("size r x r:");
        int r = scn.nextInt();
        int[][] duru = new int[r][r];

        for (int i=0; i<r; i++){
            for (int j=0; j<r; j++){
                if(i==j || i + j == r-1){
                    duru[i][j] = 1;
                }else {
                    duru[i][j] = 0;
                }
            }
        }
        for (int i=0; i<duru.length; i++){
            for (int j=0; j<duru.length; j++){
                System.out.printf("%-3d",duru[i][j]);
            }
            System.out.println();
        }
        scn.close();
    }
}
