package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class SwitchDecisionDemo {
    public static void main(String[] args) {
        //Switch statements is also called the case statement
        //give user instructions depending on the day of the week
        //Timetable format
        String dayOfTheWeek, instruction;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        dayOfTheWeek = sc.nextLine();

        switch (dayOfTheWeek) {
            case "Sunday":
                instruction="Make all of the beds";
                break;//if it is sunday change the instructions to make beds
            case "Monday":
                instruction="Do your schoolwork";
                break;
                case "Tuesday":
                    instruction="Wash the dishes";
                    break;
            default:
                instruction ="Something went wrong";
                break;
                /*
                Switch statements have limitations
                you can not do complete comparisons like if
                 */
        }
    }
}
