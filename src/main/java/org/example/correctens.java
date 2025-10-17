package org.example;

import java.util.Scanner;

public class correctens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter a number between 1 and 10");
            int uranswer=sc.nextInt();
            if(uranswer<1 || uranswer>10){
                System.out.println("out of range");
            }else{
                System.out.println("ur answer is: " + uranswer);
                break;
            }

        }
        sc.close();
    }
}
