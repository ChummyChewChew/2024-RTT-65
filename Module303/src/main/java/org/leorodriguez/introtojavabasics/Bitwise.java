package org.leorodriguez.introtojavabasics;

public class Bitwise {
    public static void main(String[] args) {
        //Initial values
        int a = 5;// 0000 0101
        int b = 7;// 000 0111

        //Bitwise and //0101 & 0111=0101 =5
        System.out.println("a&b + " + (a&b));
        //Bitwise xor 0101 ^ 0111=0010 = 2
        System.out.println("a^b + " + (a^b));
        //bitwise not // ~0101 = 1010
        //will give 2's complement of 1010 = -6
        System.out.println("~a = "+ ~a);
        //Call also be combined with shorthand
        //a=a&b
        a &= b;
        System.out.println("a= "+ a);

        //Ternary operator - shorthand
        int age = 18;
        String result;

       /* if (age < 100){
            result ="Less than 100";
        } else if (age > 100){
            result ="Greater than 100";
        }*/
        result = age<100 ? "Less than 100" : "Greater than 100";
        System.out.println(result);
    }
}
