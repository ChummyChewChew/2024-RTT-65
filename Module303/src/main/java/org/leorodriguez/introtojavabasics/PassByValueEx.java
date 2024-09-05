package org.leorodriguez.introtojavabasics;
/*
In programming, reference is a value that represents the location of a piece of data in memory
usually, the reference is not DIRECTLY accessed
 */

public class PassByValueEx {
    public static void main(String[] args) {
        int number1 =100, number2 =200, addition;
        //call my add method
        addition =add(number1,number2);
        System.out.println("After the add function is called, the value of number one is "+ number1);
        System.out.println("After the add function is called, the value of number two is "+ number2);
        //They will retain their original value
        //The add method does not change the original values
        System.out.println("The value of addition is "+ addition);
        //This is called a pass by value. Java is a pass by language

    }
    public static int add(int num1, int num2) {
        num1 = num1 + num2; //Change value
        return num1;
    }
}
