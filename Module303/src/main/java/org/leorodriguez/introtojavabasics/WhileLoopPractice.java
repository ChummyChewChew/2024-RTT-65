package org.leorodriguez.introtojavabasics;

public class WhileLoopPractice {
    public static void main(String[] args) {
        //Print numbers for 1 to 100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
            //if ++ is omitted, it becomes an infinite
        }
    }
}
