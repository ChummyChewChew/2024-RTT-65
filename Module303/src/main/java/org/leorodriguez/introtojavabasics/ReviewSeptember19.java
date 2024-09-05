package org.leorodriguez.introtojavabasics;
/*
. Variables
. Declaration
. Assignment
. Data types
. Wrapper (helper classes) and objects
. Scanner (to get input from the console)
. Formatting
. Decision Structures
. Loops
. Arrays
1. Declare some variables - two integers - 1 to 100
2. The user needs to enter those integers
3. There should be a check to ensure that the entered numbers are from 1 to 100
4. The code should loop until the user enters a valid number from 1 to 100
5. Double variables - two
6. Some sort of calculation - addition, maybe
7. The doubles have to do with money - format the numbers in money format
8. Array of strings
9. We will do something to those strings
 */

import java.util.Scanner;

public class ReviewSeptember19 {
    public static void main(String[] args){
        // We need two variables DECLARED - two integer variables:
        int firstNumber;
        int secondNumber;
        //Declare a Scanner object:
        Scanner input = new Scanner(System.in) ;
        //Ask the user for the first number:
        System.out.print("Enter your first number");
        //Take the input from the console:
        firstNumber = input.nextInt();
        //Ask the user for the second number:
        System.out.print("Enter your second number");
        //Take the input of the second number from the console:
        secondNumber = input.nextInt();

        //A loop that keeps looping if the user enters an invalid number:
        while (true){//infinite loop
            //Decision statement that checks if the first number is from 1 to 100:
        /*
        Why can we not use a Case statement?
        Dual decision if statement (only two possible options)
         */
            /*
            How do we also check to make sure the second number is valid:
             */
            if (firstNumber >= 1 && firstNumber <= 100){//within range
                //They are correct -the number is valid
                System.out.println("the first number is valid "   + firstNumber);
                // break;
            } else {//The number can either be within range or out of it:
                System.out.println("Your first number is not within the range ");
                //Ask again:
                System.out.print("Enter your number again: Range - 1 - 100 ");
                //Take the input from the console:
                firstNumber = input.nextInt();
            }//end of else
            if (secondNumber >= 1 && secondNumber <= 100){//within range
                //They are correct -the number is valid
                System.out.println("the second number is valid "   + secondNumber);
                //break;
            } else {//The number can either be within range or out of it:
                System.out.println("Your second number is not within the range ");
                //Ask again:
                System.out.print("Enter your number again: Range - 1 - 100 ");
                secondNumber=input.nextInt();
            }//end of else
            break;
        }//end of while
    }//end of main
}//end of ReviewSeptember19 class