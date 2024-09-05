package org.leorodriguez.introtojavabasics;
/*The Character class is the helper class for char
*/
public class CharacterPractice {
    public static void main(String[] args) {
        //An object of type Character
        /*static means we can use the CLASS NAME directly to access
        the method, or variable - we do not need the object to access it
         */
        Character letter = Character.valueOf('g');
        Character num = '7';
        System.out.println(letter);
        System.out.println(num);

        //Primitive char data type
        char letter_ch ='g';
        System.out.println(letter_ch);
        char num_ch ='7';
        System.out.println(num_ch);

        Character letterA = 'A';
        System.out.println(letterA);
        Character asciNumber = 97;
        System.out.println(asciNumber);

        Character uninumber = '\u0031';
        Character uninumber2 = '\u0032';
        System.out.println(uninumber);
        System.out.println(uninumber2);
        System.out.println("=====CompareTo=====");
        Character Obj1 ='2';
        Character Obj2 = '3';
        int result = Obj1.compareTo(Obj2); //This should return 0 for equal
        System.out.println(result);
        System.out.println("-----equals() -----");
        boolean result2 = Obj1.equals(Obj2);
        System.out.println(result2);
        System.out.println("----isletter() ------");
        //isletter method determines weather the specified char value is a letter
        System.out.println(Obj1.isLetter(Obj2));
        System.out.println("-----isDigit()-------");
        //isDigit() determines weather the specified char value is a digit
        System.out.println(Obj1.isDigit(Obj2));
        System.out.println("-----CompareTo------");
        Character a = 'B';
        Character aa = 'B';
        System.out.println( a == aa);
        int rs = a.compareTo(aa);
        //== is used to compare the object itself
        //equals method can be manipulated to compare the actual values
        /*compareTo does more than equals methods especially for things like sorting- it gives the numerical
        order of the characters
         */
        System.out.println(rs);
    }
}
