package org.leorodriguez.introtojavabasics;

public class ArrayDemo {
    public static void main(String[] args) {
        //declare  and initialize my array:
        double[] grades = new double[35];/* This is an array of
        type double and we want the JVM to allocate 30 elements*/
        //long way:
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        grades[3] = 70;
        grades[4] = 60;
        grades[5] = 50;
        grades[6] = 40;
        grades[7] = 30;
        grades[8] = 20;
        grades[9] = 10;
        grades[10] = 5;
        grades[11] = 4;
        grades[12] = 3;
        grades[13] = 2;
        grades[14] = 1;
        grades[15] = 0;
        grades[16] = 0;
        grades[17] = 0;
        grades[18] = 100;
        grades[19] = 90;
        grades[20] = 95;
        grades[21] = 80;
        grades[22] = 70;
        grades[23] = 60;
        grades[24] = 50;
        grades[25] = 40;
        grades[26] = 30;
        grades[27] = 20;
        grades[28] = 10;
        grades[29] = 5;
        grades[30] = 0;

        double sum = 0, average=0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i]; /*
            take all the grades and add it to the sum
            sum = sum +grades[i] , sum = grades[i];*/
        }//we will now have a sum of ALL the values in the array:
        //average:
        average = sum / grades.length;
        System.out.println("Average grade: " + average);

        //Declare without initializing elements
        String[] myStringArray;
        myStringArray = new String[5];
        myStringArray[0] = "A";
        myStringArray[1] = "B";
        myStringArray[2] = "C";
        myStringArray[3] = "D";
        myStringArray[4] = "E";

        //Declaration and initialization of our elements in one step:
        int[] myIntArray = {1,3,5,7,9,11};
        /*
        int[] myIntArray = new int[6];
        myIntArray[0]=1;..........
         */
        //myIntArray={3,4,5,6,7,8}; NO! You cannot do this!
        double myNums[] = new double[50];

    }
}