package org.leorodriguez.introtojavabasics;


import java.util.Arrays;

public class ArrayManipulationPractice {
    public static void main(String[] args) {
        //Creating different types of arrays and print heir contents
        //toString method is used to portray a string representation of the object
        //All objects inherit toString from the objects class
        //NOT to print all elements of an array
        boolean [] boolArr = new boolean[] {true, true, false, true};
        byte [] charArr = new byte[] {10, 20, 30};
        char [] strArr = new char[] {'g', 'e', 'e', 'k', 's'};
        double [] doubleArr = new double[] {1, 2, 3, 4};
        float [] floatArr = new float[] {1, 2, 3, 4};
        int [] intArr = new int[] {1, 2, 3, 4};
        long [] longArr = new long[] {1, 2, 3, 4};
        short [] shortArr = new short[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(boolArr));
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(longArr));
        System.out.println(Arrays.toString(shortArr));

        //Arrays.fill()
        double [] dvalues = new double [100];
        Arrays.fill(dvalues, 50.0); //Set all values to 50

        long [] lvalues = new long [500];
        Arrays.fill(lvalues, 2057);//Sets all values to 2057
        System.out.println(Arrays.toString(lvalues));

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2,};
        //FIll from index 1 to index 4
        //the twoIndex in all such functions is usually EXCLUSIVE
        //EXCLUSIVE means it is NOT included
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar));

        //Arrays.sort() method
        double [] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char [] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars)); //Sorted using ASCII codes



    }
}
