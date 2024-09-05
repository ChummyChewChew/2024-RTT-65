package org.leorodriguez.introtojavabasics;

public class StringConversion {
    public static void main(String[] args) {
        String intString = "1";
        int intValue = Integer.parseInt(intString); //parseInt method converts string into primitive data type
        Integer IntWrapper = Integer.valueOf(intString); //valueOf() converts string into non primitave
        System.out.println(intValue);
        System.out.println(IntWrapper);
        String doubleString = "1.0";
        double doubleValue = Double.parseDouble(doubleString);
    }
}
