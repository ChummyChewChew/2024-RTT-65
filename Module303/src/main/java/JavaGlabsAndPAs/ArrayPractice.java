package JavaGlabsAndPAs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = new int [3];
        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        System.out.println(Arrays.toString(arr));
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for (int number : arr){
            System.out.println(number);
        }
        int []arr2 =  {13, 5, 7, 68, 2};
        int half = arr2.length/2;
        System.out.println(arr2[half]);

        String [] colors ={"red", "green", "blue", "yellow"};
        String [] colors2 = colors.clone();
        System.out.println(colors2);
        System.out.println(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors2));

        int [] arr3  = {1, 2, 3, 4, 5};
        System.out.println(arr3[arr3.length-1]);

        int [] arr4 = new int[5];
        for (int i = 0; i< arr4.length; i++){
            arr4 [i] =i;
        }
        System.out.println(Arrays.toString(arr4));

        int [] arr5 = new int[5];
        for (int i = 0; i< arr5.length; i++){
            arr5 [i] =i;
            if (arr5[i]==2) {
                continue;
            }
            System.out.println(arr5[i]);

            }
        int [] arr6 ={1, 2, 3, 4, 5};
        int swapper = arr6[2];
        int swapper2 = arr6[0];
        arr6[0] = swapper;
        arr6[2]= swapper2;
        System.out.println(Arrays.toString(arr6));

        int [] arr7 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));
        System.out.println(arr7[0]);
        System.out.println(arr7[arr7.length -1]);

        Object [] arr8 = {1, "Fire", "Jump", "Cry", 10.1};
        System.out.println(Arrays.toString(arr8));

        System.out.println("How many favorite things do you have?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        Object [] arr9 = new Object[num];
        for(int i=0; i< arr9.length; i++){
            Object input = scanner.nextLine();
            arr9[i] = input;
        }
        System.out.println("Your favorite things are: ");
        System.out.println(Arrays.toString(arr9));



        }


    }


