package JavaGlabsAndPAs;
import java.util.*;

public class ArrayPA {
    public static void main(String[] args) {
        //Task one

        int[] array1 ={1, 2, 3};
        System.out.println(Arrays.toString(array1));
        for (int i =0; i<array1.length; i++){
            System.out.println(array1[i]);
        }
        //Task 2

        int [] array2 = {13, 5, 7, 68, 2};
        int middle = array2.length/2;
        System.out.println(array2[middle]);
        //Task 3

        String [] colors ={"red", "green", "yellow"};
        String[] colorsCopy = colors.clone();
        System.out.println(Arrays.toString(colorsCopy));
        //Task 4

        int [] task4 = {1, 2, 3, 4, 5};
        int firstnum = task4[0];
        int lastnum = task4[task4.length-1];
        System.out.println(firstnum);
        System.out.println(lastnum);
        //System.out.println(task4[task4.length]);
        //Out of bounds exception because it is zero based 0 to 4
        //task 5

        int [] task5 = new int [5];
        for (int i = 0; i < task5.length; i++) {
            task5[i] = i;
            System.out.println(task5[i]);
        }
        //Task 6

        int [] task6 = new int [5];
        for (int i = 0; i < task6.length; i++) {
            task6[i] = i*2;
            System.out.println(task6[i]);
        }
        //Task7

        int [] task7 = {1, 2, 3, 4, 5};
        int task7middle = task7.length/2;
        for (int i = 0; i < task7.length; i++) {
            if (i==task7middle)
                continue;
            System.out.println(task7[i]);

        }
        //Task8
        int [] task8 = {5, 6, 7, 8, 9};
        int b =task8[0];
        task8[0] =task8[4];
        task8[4] =b;
        System.out.println(Arrays.toString(task8));
        //Task 9
        int [] task9 = {4, 2, 9, 13, 1, 0};
        Arrays.sort(task9);
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i< task9.length; i++) {
            if (task9[i] > MAX){
                MAX = task9[i];
            }
        }
        for (int i = 0; i< task9.length; i++) {
            if (task9[i] < MIN){
                MIN = task9[i];
            }
        }
        System.out.println(Arrays.toString(task9));
        System.out.println(MIN);
        System.out.println(MAX);
        //Task 10
        Object [] task10 = new Object[5];
        task10[0] =10;
        task10[1] = "One";
        task10[2] ="Two" ;
        task10[3] = "Three";
        task10[4] = 10.0;
        System.out.println(Arrays.toString(task10));
        //Task11

        System.out.println("Enter how many favorite things you have: ");
        Scanner sc = new Scanner(System.in);
        String[] task11 = new String[sc.nextInt()];
        for (int i = 0; i < task11.length; i++) {
            task11[i] = sc.next();
        }
        System.out.println(Arrays.toString(task11));





    }
}
