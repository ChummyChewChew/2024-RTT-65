package org.leorodriguez.introtojavabasics;
// Break and continue
public class ContinueExample {
    public static void main(String[] args) {
        int sum =0;
        int number =0;
        while (number<20) {
            number++;
            if ( number ==10 || number == 11)
            {
                continue;//Skip and continue
            }
            System.out.println(number);
            sum+=number;
        }
        System.out.println("The sum is "+sum);
    }
}
