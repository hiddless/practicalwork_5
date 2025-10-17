package org.example;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int answer=5;
        while(true){
            System.out.println("ur guess= ");
            int uranswer =  scn.nextInt();

            if(answer == uranswer){
                System.out.println("correct");
                break;
            }else {
                if(answer > uranswer){
                    System.out.println("ur answer is lower");
                }else {
                    System.out.println("ur answer is bigger");
                }
            }
        }


    }
}
