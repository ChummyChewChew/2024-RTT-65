package org.leorodriguez.introtojavabasics;

public class StringBufferPractice {

    /*Cousin to the String Class
    creates objects, but they are MUTABLE sequence of characters
    Because the Strings are mutable, they can grow and shrink unlike
    String objects which are IMMUTABLE
     */
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java Full Stack Developer");
        int len = str.length();
        System.out.println("Length : " + len);
        int cap = str.capacity(); //Java allocates a capacity by default of 16
        System.out.println("Capacity : " + cap);

        //Append
        str.append("And Software Eng "); //appends a string in a previously defined string
        System.out.println(str);
        str.append("Java is my favorite language ");
        str.append("but I love python");
        System.out.println(str);
        //reverse
        StringBuffer stringName = new StringBuffer("Welcome to Per Schola");
        stringName.reverse();
        System.out.println(stringName);

        //insert
        StringBuffer s = new StringBuffer("Java");
        s.insert(4, "language");
        System.out.println(s);
        //Replace
        StringBuffer sT = new StringBuffer("Java");
        sT.replace(0, 2, "Hello");
        System.out.println(sT);
        StringBuffer strb = new StringBuffer("Welcome to Java Fullstack ");
        System.out.println("Original string: " + str);
        System.out.println("Substring with start index: " + str.substring(5));
        System.out.println("Substring with start and end index: " + str.substring(5, 10));



    }
}
