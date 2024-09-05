package org.leorodriguez.introtojavabasics;

public class ArrayTravel {
    public static void main(String[] args) {
        int[] values = new int[5];//an array of 5 zeros 0 0 0 0 0
        for (int num = 1; num < 5; num++) {
            values[num] = num + values[num-1];// 1 + 0
            //values[2] = 3 + values[3-1];
            //first iteration = 0 1 0 0 0
            //second iteration = 0 1 3 0 0
            //third iteration = 0 1 3 6 0
            //fourth iteration = 0 1 3 6 10

        }
        values[0] = values[1] + values[4]; // 11 1 3 6 10
        //Print elements in the array:
        for(int element: values) {
            /*
         for (int element = 0 ; element<values.length; element++*/
            System.out.println(element);// values[element]
        }

        /*
        values.length-1 because the last element index is always one less
        thank the size of the array. So, if it is an array of 1000 values,
        the last element is 999 which is 1000(values.length) - 1 which gives 999
         */
        for (int index = values.length-1; index >= 0; index--) {
            System.out.println(values[index]);
        }
        /*
        Arrays in Java:
        * When you set the length of an array it is set set
        * Arrays indices (positions) are zero-based
        * The last index in array is one less than the size of the array
        * In Java, all elements in an array have to be of the same TYPE
        * The elements in an array are not to be mistaken for the indices
         */
        int[] integerArray = {0, 1, 2, 3, 4, 5};
        int[] integerArray2 = {6, 7, 8, 9, 10,11};
        String[] stringArray = {"A", "B", "C", "D", "E", "F"};
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};


    }
}