package org.leorodriguez.introtojavabasics;
import java.util.Arrays;
import java.util.Scanner;

public class MoreArrayManipulation {
    public static void main(String[] args) {
      /*  int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // -- reading the number of elements from the that we want to enter
        n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            //-- reading array elements from the user
            array[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        // -- accessing array elements using the for loop
        for (int i=0; i<n; i++)
        {
            System.out.println(array[i]);
        }

        //Initializing arrays with random values:
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Math.random();
        }
        System.out.println("Random numbers = "+ Arrays.toString(arr));

        //Calculate the sum of all elements in the array:
        // an array of numbers
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        // iterating through each element of the array
        for (int number: numbers) {
            sum += number;// accumulate sum = sum+number
        }

        System.out.println("Sum = " + sum);

        //Finding the smallest element in an array:
        int[] myarray = {0, 2, 4, 6, 8, 10};
        int minVal = Integer.MAX_VALUE;// 2147483647
        for (int i = 0; i < myarray.length; i++) {
            //1st iteration - compare 0 and  2147483647
            if (myarray[i] < minVal) {
                minVal = myarray[i];//minVal = 0
            }
        }
        System.out.println("minVal = " + minVal);*/

        int[] arr = {25,0,2,4,6,8,10};
        int maxVal = Integer.MIN_VALUE;//-2147483648
        for(int i=0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];//1st iteration - 25,
            }
        }
        System.out.println("Max Element = " + maxVal);

        //Printing array in reverse order:
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};
        //-----print array starting from first element---------
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++) {
            System.out.print(intArray[i] + "  ");
        }
        System.out.println();
        //----------print array starting from last element----
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--) {
            System.out.print(intArray[i] + "  ");
        }

    }



}