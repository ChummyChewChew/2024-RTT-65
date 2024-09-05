package org.leorodriguez.introtojavabasics;
/* A memory address, and it holds something
There are various types of variables-data types
Student name -String- sequence of characters
Student age - int(Integer) - whole number
Student grade - double or float - decimal type
Student social security number - long - really long whole number
 */

public class VariableDemo {
    public static void main(String[] args) {
        //Declaration
        String studentName;
        int studentAge;
        double studentGrade;
        long socialSecurityNumber;

        //Assignment
        studentName = "Ezra Williams";
        studentAge = 25;
        studentGrade = 100;
        socialSecurityNumber = 10000;
        //Declaring and assigning in the same line
        String studentName2 = "Bob smith"; //Lower camel case
        String _studentName = "John Smith";
        String $studentName = "Jack Smith";
        String student_name_plus = "Jessica"; //Snake case
        String STUDENTNAME ="Dylan"; //Uppercase
        String StUdEnTnAmE = "Rick";
        studentName = "Zurika Yahaya";
        studentAge = 30;
        String name1 = "Jim", name2 ="Tim", name3 = "Goyo";//Literal
        int num1 =1, num2 =2, num3 =3;//Must be the same data type
        Integer num4; //Wrapper class

        //Character types = Charecters on the keyboard
        char lettera = 'A';
        char dollarsign = '$';
        char tild = '~';
        char letterb = 66;//U+0042

         //Integral type = whole number type
        //Whole number -128 to 127
        byte b= 10;
        //whole number -32768 to 32767
        short s = 128;
        // int -2147483648 to 2147483647
        int i = 32768;
        // long -9223372036854808 to 9223372036854807
        long l =21474836478L; // You need a l at the ned. Can be L
        //Decimal types
        float f =3.14f; //You need a f at the end. Can also be F
        double d = 3.14;
        // Boolean true or false
        boolean bool = true;
        boolean b1 = false;

        //Escape Sequences
        System.out.println("This will print on \r\ntwo lines");// \r Carriage-return character
        System.out.println("She said \"Hello\" to me");// \"Double-quote Character
        System.out.println("This will print two back slashes \\\\");// \\Backslash character

        //Constants - value that does not change
        final String Monday = "Monday";
        final double PI = 3.14;
        final String School = "Per Scholas";

        //Monday = "Tuesday"; Constants can not change



    }
}
