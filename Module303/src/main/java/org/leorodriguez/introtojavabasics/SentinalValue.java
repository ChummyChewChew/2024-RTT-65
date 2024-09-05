package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class SentinalValue {
    public static void main(String[] args) {
        //Create a Scanner:
        Scanner in = new Scanner(System.in);

        //Read some data from the user:
        System.out.print("Enter an integer (if you enter 0, this ends the app): ");
        int data = in.nextInt();

        //Keep reading data until the user enters zero:
        int sum=0;
        while (data != 0){ //while the user has not entered zero, until the user enters 0
            sum = sum + data;

            //Read the next value:
            System.out.print("Enter an integer again (remember to enter 0 to stop): ");
            data = in.nextInt();
        }

        System.out.println("The sum of the digits is " + sum);
    }
}