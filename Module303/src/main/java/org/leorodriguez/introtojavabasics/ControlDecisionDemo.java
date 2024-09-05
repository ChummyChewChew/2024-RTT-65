package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class ControlDecisionDemo {
    /*
    Flow Statements :if, if.. else, if.. if else...else Switch
     */
    public static void main(String[] args) {
        int num1, num2;
        num1 = 100;
        num2 = 200;
        if (num1 == num2){// two for equal one for assignment
            System.out.println(num1+ " is equal to " + num2);
        }
        else{
            System.out.println(num1+ " is not equal to " + num2);
        }
        //multiway if statement

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num1 = scanner.nextInt();

        if(num1%2 ==0){//Checking if there is no remainder when divided by two
            System.out.println(num1+ "is even");
        } else {
            System.out.println(num1+ "is odd");
        }

        if (num1< 0){
            System.out.println(num1+ " is less than 0");
        }else if (num1 > 0){
            System.out.println(num1+ " is greater than 0");
        } else {
            System.out.println(num1+ " is equal to 0");
        }
    }
}
