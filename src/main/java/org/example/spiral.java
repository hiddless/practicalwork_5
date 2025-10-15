package org.example;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("n: ");
        int n = scn.nextInt();

        int[][] duru = new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int v=0;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                duru[top][i] =v++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                duru[i][right]=v++;
            }
            right--;

            if(top<=bottom){
                for (int j = right; j >= left; j--) {
                    duru[bottom][j] = v++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                    duru[i][left] = v++;
                }
                left++;
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
