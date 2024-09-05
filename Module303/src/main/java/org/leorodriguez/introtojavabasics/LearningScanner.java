package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        //Scanner allows us to get input from the user
        Scanner scanner = new Scanner(System.in);//Object of TYPE scanner
        //System.in - System.out
        //get name
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        //Calculator get two numbers from the user
        //Ask the user for the first number:
        System.out.println("Please enter the first number");
        //We use the scanner to grab the first number
        int number1 = scanner.nextInt();
        //Ask  the user for the second number
        System.out.println("Please enter the second number");
        //Use the scanner to grab the next int
        int number2 = scanner.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 / number2;
        //Modulus- remainder operator
        int leftover = number1 % number2;

        //Concatenation - string concatenation joining String
        //Joining variables to creat complete strings
        System.out.println("Your first number is "+ number1+ ", "+ name);
        System.out.println("Your second number is "+ number2+ ", "+ name);
        System.out.println("Addition is "+ addition + ", "+ name);
        System.out.println("Subtraction is "+ subtraction + ", "+ name);
        System.out.println("Multiplication is "+ multiply + ", "+ name);
        System.out.println("Divide is "+ divide + ", "+ name);
        System.out.println("Leftover is " + leftover + ", "+ name);



    }
}
