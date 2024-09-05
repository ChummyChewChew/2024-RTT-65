package org.leorodriguez.introtojavabasics;
/*
Write a program that prompts the user to enter a year, and
display the animal for the year.
year%12 =
0: monkey
1: rooster
2:dog
3:pig
4:rat
5:ox
6:tiger
7:rabbit
8:dragon
9:snake
10:horse
11:sheep
 */

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        {
            //Declare variables:
            Scanner scanYear = new Scanner(System.in);
            int year = 0;
            System.out.print("Enter your calendar year: ");
            year = scanYear.nextInt();
            /*

            0: monkey
            1: rooster
            2:dog
            3:pig
            4:rat
            5:ox
            6:tiger
            7:rabbit
            8:dragon
            9:snake
            10:horse
            11:sheep
            */
            switch (year % 12) {
                case 0:
                    System.out.println("monkey");
                    break;
                case 1:
                    System.out.println("rooster");
                    break;
                case 2:
                    System.out.println("dog");
                    break;
                case 3:
                    System.out.println("pig");
                    break;
                case 4:
                    System.out.println("rat");
                    break;
                case 5:
                    System.out.println("ox");
                    break;
                case 6:
                    System.out.println("tiger");
                    break;
                case 7:
                    System.out.println("rabbit");
                    break;
                case 8:
                    System.out.println("dragon");
                    break;

                case 9:
                    System.out.println("snake");
                    break;
                case 10:
                    System.out.println("horse");
                    break;
                case 11:
                    System.out.println("sheep");
                    break;
                default:
                    System.out.println("invalid year");
                    break;
            }


        }

    }
}