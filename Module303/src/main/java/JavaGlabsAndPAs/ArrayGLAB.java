package JavaGlabsAndPAs;

import java.util.Scanner;

public class ArrayGLAB {
    public static void main(String[] args) {
        /*int [] age = {12,4,5, 2, 5};
        System.out.println("Accessing the elements of the array");
        System.out.println("First element "+ age[0]);
        System.out.println("Second element "+ age[1]);
        System.out.println("Third element "+ age[2]);
        System.out.println("Fourth element "+ age[3]);
        System.out.println("Fifth element "+ age[4]);

         */

        //demo 2
        /*

        int [] age = {12, 4, 5};
        System.out.println("Using for loop");
        for (int i = 0; i<age.length; i++) {
            System.out.println("Age is " + age[i]);
        }
        */
         //demo 3
        /*
        //Enhanced for loop
        String [] names ={"New York", "Dallas", "Las Vegas", "Florida"};
        for ( String name : names){
            System.out.println(name);
        }
        */

        //demo 4
        /*
        int [] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8 ,12};
        int sum = 0;
        double average;
        //Access all elements using each loop
        //Add each element in the sum
        for (int number : numbers){
            sum += number;
        }
        //get the total number of elements
        int arrayLength = numbers.length;
        //convert the average from int to double
        average = ((double)sum/ (double)arrayLength);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);

         */
        //demo 5
        //Declare variable
        /*int [] marks = {74, 43, 58, 60, 90 ,64, 70};
        int sum2 = 0;
        int sumSq = 0;
        double mean, stdDev;
        //Compute sum and square sum using loop
        for (int i =0; i < marks.length; i++) {
            sum2 += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum2 / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean );
        //print results
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);

         */
        Scanner scanner = new Scanner(System.in);
        int i, element;
        int [] array = new int[11];

        System.out.println("Enter 10 int elements: ");
        for (i = 0; i < 10; i++)
            array[i] = scanner.nextInt();

        System.out.println("Enter the element to insert");
            element = scanner.nextInt();
            array[i] = element;

            System.out.println("\nNow the new array is ");
            for (i =0; i<11; i++)
                System.out.println(array[i]+" ");

    }
}
