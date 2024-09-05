package org.leorodriguez.introtojavabasics;
/*
Every primitive has a Wrapper class associated with it
boolean Boolean
char Character
byte Byte
short Short
long Long
float Float
double Double
 */

public class WrapperClass {
    public static void main(String[] args) {
        byte b =100; //Primative version
        Byte bb = 100; //Object version
        short s =100;
        Short ss = 100;
        int i = 100;
        Integer ii = 100;
        Integer iii = Integer.valueOf(1000);
                    //New Integer (1000); // New operator
        long l = 100l;
        Long ll = 100l;
        float f = 100f;
        Float ff = 100f;
        double d = 100d;
        Double dd = 100d;
        char ch = 'c';
        Character cha = 'c';
        boolean bo = true;
        Boolean boo = true;

        //Autoboxing
        int a = 20; //A variable using an inbuilt primitive type
        Integer covnertIntoInteger = a; //Integer Object

        char c = 'A';
        Character convertIntoCharacter =c;

        double ddd = 562.23;
        Double convertInToDouble =100.5;
        //Unboxing example
        Integer i2 =56;
        int ii2 =i2;

        Character c2 = 'a';
        char ch2 =c2;

        Double d2 = 2563.32;
        double dd2 =d2;
    }
}
