package org.example;

import java.util.Scanner;

public class matrix_u {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("a: ");
        int a_lengt =  scn.nextInt();
        int[] a = new int[a_lengt];
        for (int i =0; i<a_lengt; i++) {
            System.out.print("a["+i+"]: ");
            a[i] = scn.nextInt();
        }
        System.out.print("b: ");
        int b_lengt =  scn.nextInt();
        int[] b = new int[b_lengt];
        for(int i =0; i<b_lengt; i++) {
            System.out.print("b["+i+"]: ");
            b[i] = scn.nextInt();
        }
        int[] c = new int[a_lengt + b_lengt];

        for (int i = 0; i < a_lengt; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b_lengt; i++) {
            c[a_lengt + i] = b[i];
        }

        System.out.print("c = { ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) System.out.print(" ");
        }
        System.out.print(" }");

        scn.close();
    }

}
