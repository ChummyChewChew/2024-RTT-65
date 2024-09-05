package org.leorodriguez.introtojavabasics;

public class StringPractice {
    public static void main(String[] args) {
        /*Sequence of characters- String variable
        String is immutable- means that the state of a string object cannot change after it is created. We can change the reference to it
        (What it holds or represents) but we can not change the object itself (that weird thing with a weird character value in the memory)
         */
        //Creates a new string object (heap)
        //Creates a literal "Welcome" In the STRING CONSTANT POOL

        String s = new String("Welcome");
        //String literal
        String s1 = "Welcome";
        //Sting literal
        /* Since the String already exists in a constant pool, the jvm does not
        create a new String in the constant pool
         */
        String s2 = " Welcome ";
        //s1 and s2 are different in the Sting Constant pool because of the spaces
        String s3 = "welcome";
        //This is new too because of the lower case

        //Length:
        int length =s2.length();
        //Spaces are included in length so it's 9
        int length1 = s2.length(); //7
        System.out.println(length);
        System.out.println(length1);

        //isEmpty method it returns true if the length of the string is zero
        String s4 = "";
        int length2 =s4.length(); //0
        String s5 = " ";
        int length3 =s5.length(); //1
        boolean emptyornot = s4.isEmpty();// true
        boolean emptyornot1 = s5.isEmpty(); // false
        System.out.println(length2);
        System.out.println(length3);
        System.out.println(emptyornot);
        System.out.println(emptyornot1);

        //isBlank -contains only white space
        boolean blankOrNot = s3.isBlank();// false
        boolean blankOrNot1 = s4.isBlank();
        System.out.println(blankOrNot);
        System.out.println(blankOrNot1);

        //String comparison :
        //Equals method :
        boolean equalsOrNot = s3.equals(s4);
        System.out.println(equalsOrNot);
        //equalsIgnoreCase - if they refer to the same spelled word
        boolean equalsCase = s1.equalsIgnoreCase(s3); //should return true
        // LEO leo Leo LeO
        System.out.println(equalsCase);

        //compareTo
        int sameOrNot = "Ezra".compareTo("Justice");
        System.out.println(sameOrNot);
        //Is in lexicon order and returns a int. B is -1 to a
        //A method is a type of code that does a specific thing

        //valueOf : digs deep into the variable and extracts the value:
        int intValue = 100;
        /*
        I have a integer, I want to convert it to a String so that I can use it as a String.
        In order to do that, I creat a String and I call the valueOf method
        to take the integer and convert it to a string.
         */
        String stringOfIntValue = String.valueOf(intValue);

        String myString = "Ezra Williams";
        System.out.println(myString);
        boolean checkForE = myString.startsWith("E"); //True
        checkForE = myString.startsWith("e"); //False
        boolean checkForS = myString.endsWith("s"); //True

        //Indices - 0, 1, 2 - indices are zero based
        //indexOf returns the posiotion of the first occurrence of that character
        int positionOfW = myString.indexOf("W"); //5
        System.out.println(positionOfW);
        int positionOfLastW = myString.lastIndexOf("W");
        System.out.println(positionOfLastW);

        //Sometimes we want to make sure a string contains something:
        boolean containsX = myString.contains("X");
        System.out.println(containsX);

        //Extract a character
        char  characterZ = myString.charAt(1);
        System.out.println(characterZ);

        //Extract a substring
        String firstName = myString.substring(0,4); //Always one more than ending index
        System.out.println(firstName);

        //Conversion methods
        String ezreaLowerCase = myString.toLowerCase();
        System.out.println(ezreaLowerCase);

        String ezraUpperCase = myString.toUpperCase();
        System.out.println(ezraUpperCase);

        //Concat it takes one string and joins it to another string
        String programmer ="Programmer";
        myString = myString.concat(programmer);
        System.out.println(myString);

        //Trim- creates a new String, removing white spaces from the front and back
        String trimmeds2 = s2.trim();
        System.out.println(trimmeds2);

        //Strip - strips the leading and trailing white spaces:
        String trimmedS22 = s2.strip();
        System.out.println(trimmedS22);

        //Processing methods
        //replace
        String perScholas = "Per Scholas";
        String newPerScholas = perScholas.replace('P', 'M');
        System.out.println(newPerScholas);

        String newPerScholas2 = perScholas.replace("Per", "My");
        System.out.println(newPerScholas2);

        //Check to see if some parts of the String matches something:
        boolean doesItMatch = perScholas.matches(newPerScholas);
        System.out.println(doesItMatch);

        //Replace all:
        String str1 ="aabaac";
        String str2 ="Learn223Java55from555perscholas";
        //regex for sequience of digits
        String regex = "\\d+";

        //All occurances of "aa" is replaceAll with "zz"

        System.out.println(str1.replaceAll("aa", "zz"));





    }
}
