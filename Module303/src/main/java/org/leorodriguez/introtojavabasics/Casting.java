package org.leorodriguez.introtojavabasics;

public class Casting {
    public static void main(String[] args) {
        /*
        Casting is when you assign a value of one type to another type.
        Explicit casting - assign a value of a larger data type within a smaller range
        Smaller range
        double - float- long - int- short - byte
         */
        int x;
        double y = 9.99;
        //We can cast y as a int
        x = (int)y;  // Take the double and cast it as a integer
        System.out.println(x);

        byte i = 40;
        //No casting needed for the below conversion
        short j =i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("Byte value is "+i);
        System.out.println("Short value is "+j);
        System.out.println("Integer value is "+k);
        System.out.println("Long value is "+l);
        System.out.println("Float value is "+m);
        System.out.println("Double value is "+n);
        float f = 1.5e3f;
        k = (int)f;  //Explicit casting is totallly legal. We are trying to cast a float as a int
        //a float as an int
        //k =f ; Not allowed= narrowing

        byte a=40, b = 50, c = 100;
        int d = a * b / c ;

    }
}
