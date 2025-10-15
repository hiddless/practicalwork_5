package org.example;

import java.util.Scanner;

public class task_numbers_snake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("n: ");
        int n = scn.nextInt();

        int[][] duru = new int[n][n];
        int v= 0;
        for(int j =0; j<n;j++){
            if(j%2==0){
                for(int i = 0;i<n;i++){
                    duru[i][j] = v + (n-1-i);
                }
            }else {
                for(int i = 0;i<n;i++){
                    duru[i][j] = v + i;
                }
            }
            v +=10;
        }
        for (int i = 0; i < duru.length; i++) {
            for (int j = 0; j < duru[i].length; j++) {
                System.out.printf("%-3d ", duru[i][j]);
            }
            System.out.println();
        }

    }
}


