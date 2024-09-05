package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class ControlDecisionsDemo {
    public static void main(String[] args) {
        //nested if statments demo
        int i =1, j=2, k=4;
        if (i>j) {
            if (i > k) {
                System.out.println("A");
            }
        }
            else
                System.out.println("B");

            //Check age ; if they are younger than 18 the price is 5
            //If they are 18 or older, then the price is 10
            //If they are 65 and older, they get a discount of 5 percent
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age.");
        int age = sc.nextInt();
        double price =0, discount =.05;
        if (age < 18){
            price =5.00;
        } else {
            price=10;
            if (age>= 65){
                price =price- (price*discount);
            }
        }
    }
}
