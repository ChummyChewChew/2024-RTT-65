package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int firstnum = sc.nextInt();
        System.out.println("Enter second num");
        int secondnum = sc.nextInt();
        //Initializing ints and getting the user input
        while ((firstnum >= 100 & firstnum >=1) & (secondnum >= 100 & secondnum >=1)){
            System.out.println("Both numbers are invalid. Enter both again");
            firstnum = sc.nextInt();
            secondnum = sc.nextInt();
            //Checks to see if both numbers are invalid.
        }
        while (firstnum >= 100 & firstnum >=1) {
            System.out.println("Invalid first value. Enter again");
            firstnum = sc.nextInt();
        }//Checks if only the first int is invalid
        while (secondnum >= 100 & secondnum >=1) {
            System.out.println("Invalid second value. Enter again");
            secondnum = sc.nextInt();
        } //Checks if the second number is valid
        System.out.println("First number is valid "+firstnum);
        System.out.println("Second number is valid "+ secondnum);
        //If both are valid, then it displays them
        //Group members are Ndissan and Brian
    }
}
