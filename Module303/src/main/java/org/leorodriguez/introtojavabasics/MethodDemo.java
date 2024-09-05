package org.leorodriguez.introtojavabasics;

import java.util.Scanner;
/*
Polymorphism - main forms
Method overloading - main implementations of polymorphism
Overloading- only the signature(Method name and parameters) matters
Access modifier, static or non static, return type does not matter
 */

public class MethodDemo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println("Enter an integer: ");
        int number2 = sc.nextInt();
        System.out.println("The sum is the numbers is"+ number+number2);
        System.out.println("Enter an integer: ");
        //Instead of typing out all of this, we can call a method. Also called invocation
        add(number,number2); //Number and number2 are out arguments. This is called a signature
        int summation = add2(number,number2); //Call(invocation)
        System.out.println("The sum is "+summation);
        PracticeStudent eztraStudent = returnStudent();
    }
    /*
    public (access modifier) - private, protected, (default)- if left out assigns default
    static- the method belongs directly to the class /Optional
    void- the method does not return a value- primitive type, reference type
    method name- the parameters of the method- zero or more parameters
    in parentheses- the parameters of the method
    {} the body of the method, sometimes called method block
     */
    public static void add (int number, int number2){
        int sum = number+number2;
        System.out.println("The sum is "+sum);
    }
    public static int add2 (int number, int number2){
        int sum = number+number2;
        return sum; //NOT optional when there is a return type instead of void
        //This is usual when you want to assign the result to a variable
        //like sum =add2(number, number2)
        //Non static returns are called FUNCTIONS
        //Return types must match the data type the funtion is asking for
    }
    public static int /* ONLY THIS PART MATTERS ->*/add3(int number, int number2){//The important part off the signature is the name and arguments. They must be different
        //further note! the number and number2 don't count! Only add3 (int, int)
        int sum = number+ number2;
        System.out.println("The sum is "+sum);
        return sum;

    }

    public static PracticeStudent returnStudent(){
        //return new Student ()
        PracticeStudent student = new PracticeStudent();
        return student;
    }
}
