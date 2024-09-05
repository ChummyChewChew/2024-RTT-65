package JavaGlabsAndPAs;

import java.util.Scanner;

public class forloopGlab {
    public static void main(String[] args) {
        /*for (int i =1; i<=5; i++){
            System.out.println("Welcome to Java");
        }
        int sum =0;
        int n =1000;
        for (int i =1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum ="+ sum); */
        /*String original, reverse ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palidrome");
        original = sc.nextLine();
        int lenght = original.length();
        for (int i = lenght -1; i>=0; i--)
            reverse = reverse + original.charAt(i);
            if (original.equals(reverse)){
                System.out.println("Entered string/number is a palindrome");
            }else {
                System.out.println("Entered string/number is not a palindrome");
            } */
            for (int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();// new line
            }

    }
}
