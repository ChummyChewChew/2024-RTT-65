package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =2;
        String input;
        while (true){//use with cation always true
            System.out.println(num);
            System.out.println("Do you want to continue? Enter Y/N");
            input = sc.next();
            /*
            next() get anything up to the white space
            nextLine() get the whole line white space included
             */
            if (input.equalsIgnoreCase("N")){
                break;//leave the while loop
            }
            num +=2;
        }
        System.out.println("Okay, we are done");
    }
}
