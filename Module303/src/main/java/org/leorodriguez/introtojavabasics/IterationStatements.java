package org.leorodriguez.introtojavabasics;

public class IterationStatements {
    public static void main(String[] args) {
        //Printing numbers from one to one hundred
        //For loop
        /* Initialization - where to do we start? i =1
        condition= dictates how many skips we have
        increment how many skips we want i++
         */
        for (int i=1; i <=100; i++){
            System.out.println(i);
            System.out.println(1);
        }//for loop end 14
        //We are printing welcome to Full Stack Java 100 times
        for (int j =0; j<100; j++){
            System.out.println("Welcome to Full Stack Java");
        }// for loop end 18
        int weeks = 3;
        int days = 7;
        //outer loops prints weeks
        for (int i = 1; i<=weeks; ++i){
            System.out.println("Week "+ i);
            //Inner loops prints days
            for (int j = 1; j<= days; ++j){
                System.out.println("Day "+ j);
            }//Inner for loop ends here - starts on 25
        }// Outer for loop ends here = starts 22
    }
}
