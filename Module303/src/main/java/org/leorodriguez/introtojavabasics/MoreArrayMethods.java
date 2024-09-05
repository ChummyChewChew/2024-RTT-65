package org.leorodriguez.introtojavabasics;
import java.util.Arrays;

public class MoreArrayMethods {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35};

        // sorting the array
        Arrays.sort(intArr);
        // System.out.println(Arrays.toString(intArr));

        // declare element for searching
        int element = 10;
        System.out.println(element + " found at index = " +
                Arrays.binarySearch(intArr, element));

    }
}