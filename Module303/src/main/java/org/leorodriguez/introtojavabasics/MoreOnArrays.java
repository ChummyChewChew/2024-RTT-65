package org.leorodriguez.introtojavabasics;

public class MoreOnArrays {
    public static void main(String[] args) {
        int [] list = {2, 18, 16, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            //Array length is immutable, but the elements themselves can be altered
            list[i] = list[i] + (list[i]/list[0]);
            /*first iteration:
            list[0] = 2 +1 = 3
            list [1] = 18 + (18/3) = 24
            list [2] = 6 + (6/3)
            list [3] = -4 + (-4/3) =-5
            list [4] = 5 = (5/3) = 6
            list [5] = 1 = (1/3) = 1
             */
        }
        //To print the array
        for (int element: list){
            System.out.println(element);
        }
    }
}
