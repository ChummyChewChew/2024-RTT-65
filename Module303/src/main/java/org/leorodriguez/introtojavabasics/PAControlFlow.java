package org.leorodriguez.introtojavabasics;

import java.util.Scanner;

public class PAControlFlow {
    public static void main(String[] args) {
        int x =50;
        Scanner sc = new Scanner(System.in);
        /*if (x<10){
            System.out.println("Less than 10");
        } else if (x>10) {
            System.out.println("Greater than 10");
        }*/
        /*if (x<10){
            System.out.println("X is less than 10");
        } else if (x>10 && x<20) {
            System.out.println("X is between 10 and 20");
        } else if (x>=20) {
            System.out.println("X is greater or equal to 20");
        }*/
        /*System.out.println("Enter grade: ");
        int grade = sc.nextInt();
        if (grade >= 90 && grade <= 100) {
            System.out.println("A");
        } else if  (grade >=80 && grade <=89){
            System.out.println("B");
            } else if (grade >=70 && grade <=79) {
            System.out.println("C");
        }else if (grade >=60 && grade <=69) {
            System.out.println("D");
        } else if(grade <60){
            System.out.println("F");
        } else if (grade>0 && grade >100){
            System.out.println("Score out of range");
        } */
        /*System.out.println("Enter day");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                            case 5:
                                System.out.println("Friday");
                                break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                    case 7:
                                        System.out.println("Sunday");
                                        break;
                                        default:
                                            System.out.println("Invalid day");

        }*/

        System.out.println("Input filing status. 1 = single, 2 = married filing joints/ qualifying widower, 3 = married filling separately, and 4 = head of household. ");
        int filingstatus = sc.nextInt();
        System.out.println("Input income ");
        int income = sc.nextInt();
        if (filingstatus == 1) {
            if (income>= 372951){
                System.out.println("35 percent");
            } else if (income>=171551 && income<=372950){
                System.out.println("33 percent");
            } else if (income>=82251 && income<=171550){
                System.out.println("28 percent");
            } else if (income>=33951 && income<=82250){
                System.out.println("25 percent");
            } else if (income>=8351 && income<=33950){
                System.out.println("15 percent");
            } else if (income>=0 && income<=8350){
                System.out.println("10 percent");
            }
        }else if (filingstatus == 2) {
            if (income>= 372951){
                System.out.println("35 percent");
            }else if (income>=208851 && income<=372950){
                System.out.println("33 percent");
            }else if (income>=137051 && income<=208850){
                System.out.println("28 percent");
            }else if (income>=67901 && income<=137050){
                System.out.println("25 percent");
            }else if (income>=16701 && income<=67900){
                System.out.println("15 percent");
            } else if (income>=0 && income<=16700){
                System.out.println("10 percent");
            }
        }else if (filingstatus == 3) {
            if (income>= 186476){
                System.out.println("35 percent");
            }else if (income>=104426 && income<=186475){
                System.out.println("33 percent");
            }else if (income>=137051 && income<=208850){
                System.out.println("28 percent");
            }else if (income>=67901 && income<=137050){
                System.out.println("25 percent");
            }else if (income>=16701 && income<=67900){
                System.out.println("15 percent");
            }else if (income>=0 && income<=16700){
                System.out.println("10 percent");
            }
        }else if (filingstatus == 4) {
            if (income>= 372951){
                System.out.println("35 percent");
            }else if (income>=190201 && income<=372950){
                System.out.println("33 percent");
            }else if (income>=117451 && income<=190200){
                System.out.println("28 percent");
            }else if (income>=45501 && income<=117450){
                System.out.println("25 percent");
            }else if (income>=11951 && income<=45500){
                System.out.println("15 percent");
            }else if (income>=0 && income<=11950){
                System.out.println("10 percent");
            }
        }
    }


}
