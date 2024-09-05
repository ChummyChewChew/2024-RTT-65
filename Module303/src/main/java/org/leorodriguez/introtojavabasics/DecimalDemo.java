package org.leorodriguez.introtojavabasics;

import java.text.DecimalFormat;

public class DecimalDemo {
    public static void main(String[] args) {
        String pattern = "####,####.##";
        double number=123456789.123;
        DecimalFormat numberformat= new DecimalFormat(pattern);
        System.out.println(number);
        System.out.println(numberformat.format(number));
    }
}
