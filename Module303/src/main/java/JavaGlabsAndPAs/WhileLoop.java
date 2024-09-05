package JavaGlabsAndPAs;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*int number = (int) (Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100");
        int guess = -1;
        while (guess!= number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Guess too high");
            } else {
                System.out.println("Guess too low");
            }
        } */
        /*final int NUMBER_OF_QUESTIONS = 5; //Number of questions
        int correctCount =0; //Count the number of correct answers
        int count =0; //Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = "";// string is currently empty
        Scanner sc = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            //1. generate two random single digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            //2. if number1 < number2, swap number 1 with two
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            //3.prompt the user to answer what is number 1- number 2
            System.out.print("What is "+ number1 +"-"+ number2+ "? ");
            int answer = sc.nextInt();
            //4.Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("Correct!");
                correctCount++;
            } else
                System.out.println("Wrong!\n" +number1+" - "+number2+ " should be "+ (number1-number2));
            //increase count
            count++;
            output += "\n" + number1+ "-"+ number2+ "="+ answer+ ((number1-number2== answer) ?" correct":" wrong");

        }
        System.out.println(output);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int value(the program exits if the input is 0) : ");
        int data = sc.nextInt();
        //keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            //read the next data
            System.out.println("Enter another int value(the program exits if the input is 0) : ");
            data = sc.nextInt();
        }
        System.out.println("The sum of the numbers is " + sum);

    }
}
