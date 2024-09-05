package org.leorodriguez.introtojavabasics;
import java.util.Arrays;

public class CopyingArraysPractice {
    public static void main(String[] args) {
        /*
        These are DIFFERENT objects (instance)
        Here we are creating a DEEP COPY - it elements of on array are changed,
        corresponding elements of the other array remain unchanged.
        Deep copy means we create a new array and we ensure that the original array and the
        copied array are INDEPENDENT - changes to one does not affect the other.
         */
        int[] sourceArrays = {2,3,4,5,10};// source array - the array we are copying from
        int[] targetArrays = new int[sourceArrays.length];//target array - the one we are copying to
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        System.out.println(sourceArrays);
        System.out.println(targetArrays);
        /*
        What if I try to COMPARE these two arrays, using the == sign
         */
        if (targetArrays == sourceArrays) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }
        int lastIndex = targetArrays.length - 1;
        targetArrays[lastIndex] = 500;
        System.out.println(Arrays.toString(targetArrays));
        System.out.println(Arrays.toString(sourceArrays));

        //Object.clone() - Remember the Object class is the SUPERCLASS of all classes:
        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(targetArray));
        sourceArray[2] = 500;
        System.out.println("Source Array: " +Arrays.toString(sourceArray));
        System.out.println("Target Array: "+Arrays.toString(targetArray));
        int[] targetArray2 = new int[2];

        //System - arrayCopy method:
        System.arraycopy(sourceArray, 2, targetArray2, 1, 1);
        System.out.println(Arrays.toString(targetArray2));

        //Arrays copyOf method:
        int[] targetArray3 = Arrays.copyOf(targetArray2,3);
        System.out.println(Arrays.toString(targetArray3));




    }
}