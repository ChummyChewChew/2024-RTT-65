package org.leorodriguez.introtojavabasics;

public class multiDimensionalArrayDemo {
    public static void main(String[] args) {
        //integer variables:
        int rows=5, columns=4;
        double[][] grades = {
                {95, 98, 100, 96},
                {100, 95, 98, 100},
                {97, 100, 96, 99},
                {98, 95, 98, 100},
                {90, 100, 94, 98} };

        // Print the values:
        for (int row=0; row<rows; row++) {//iterating through the rows
            for (int column=0; column<columns; column++) {
                //            iterate through the columns
                System.out.print(grades[row][column] + " ");
            }
            System.out.println();
        }

        // []int a = [10]int;
        // int a[10];
        // int[10] a = new int[10];
        // int a[10] = new int[10];
        //int[] a = new int[10];

        //  int[] a = {17, -3, 42, 5, 9, 28};
        // int a {17, -3, 42, 5, 9, 28};
        //int[] a = new int[6] {17, -3, 42, 5, 9, 28};
        // int[6] a = {17, -3, 42, 5, 9, 28};
        //int[] a = new {17, -3, 42, 5, 9, 28} [6];
    }
}