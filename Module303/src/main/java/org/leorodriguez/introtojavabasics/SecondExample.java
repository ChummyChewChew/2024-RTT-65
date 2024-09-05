package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seconds, hours, minutes, milliseconds;
        System.out.println("Input seconds: ");
        seconds= in.nextInt();
        // 86399; 23:59:59
        milliseconds = seconds%60;
        hours = seconds/60;
        minutes = hours%60;
        hours =  hours/60;

        System.out.printf("%d:%02d:%02d", hours, minutes, milliseconds);
    }
}
