package JavaGlabsAndPAs;

import java.util.Scanner;

public class LoopsPA {
    public static void main(String[] args) {
       // int multiple = 12;

        /*for (int i =1; i <=multiple; i++){
            for (int j =1; j<=multiple; j++){
                int answer = i*j;
                System.out.println(answer);
            }
        }*/
        /*Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd =0;
        for (int i =1; i <=n1 && i <=n2; i++) {
            if(n1 % i ==0 && n2 % i ==0)
                gcd =i;
            }
        System.out.println("The gcd is "+gcd); */

        double initialtuition =10000;
        double rate =1.07;
        double maxtuition = 20000;
        double currenttuition =10000;
        double risingtuition =10000;
        int years =0;
        while (risingtuition <= maxtuition) {
            risingtuition += risingtuition*rate-initialtuition;
            years++;
            System.out.println(risingtuition);
        }


        }
    }

