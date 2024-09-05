package org.leorodriguez.introtojavabasics;

import java.util.Arrays;

public class JavaStringMethodsLab {
    public static void main(String[] args) {
        //Lenght
        String str1 = "Java";
        String str2 = "";
        System.out.println(str1.length()); //4
        System.out.println(str2.length());//0
        System.out.println("Java".length());//4
        System.out.println("Java\n".length());//5
        System.out.println("Learn Java".length());//10
        //isEmpty
        String s1 ="";
        String s2 ="Hello";
        System.out.println(s1.isEmpty()); //True
        System.out.println(s2.isEmpty()); //False

        String trim = "   Hello   ";
        System.out.println(trim+ "how are you");
        System.out.println(trim.trim()+ " how are you");
        //toLowerCase
        String lower ="HELLO HOW ARE YOU";
        String lower2 =lower.toLowerCase();
        System.out.println(lower2);
        //to upper
        String upper ="hello how are you";
        String upper2 =upper.toUpperCase();
        System.out.println(upper2);
        //concat
        String concat = "Learn ";
        String concat2 = "Java";
        System.out.println(concat.concat(concat2));
        System.out.println(concat2.concat(concat));
        String concat3 = "Hello";
        String concat4 ="Learners";
        String concat5 = concat3 = concat4;
        String message = "Welcome"+ "to"+ "java";
        String s = "Chapter" + 2;//can join numbers
        String c1 ="Supplement" +'B';//Becomes supplementB because no space
        //Split
        String vowels = "a::b::c::d:e";
        String [] splitresult =vowels.split("::");
        System.out.println("Result = "+ Arrays.toString(splitresult));
        //Getting chars from string
        String CHARAT = "Welcome to Java";
        System.out.println("The first character in the message is "+ CHARAT.charAt(0));
        //CompareTO
        String compare = "hello";
        String compare2 = "hello";
        String compare3 = "hemlo";
        String compare4 = "flage";
        System.out.println(compare.compareTo(compare2));
        System.out.println(compare.compareTo(compare3));
        System.out.println(compare.compareTo(compare4));
        //Substring
        String subprac = "Java is fun";

        System.out.println(subprac.substring(0,4));

        //IndexOf
        String Iprac = "Java is fun";
        int result;
        result = Iprac.indexOf('s');
        System.out.println(result);
        result = Iprac.lastIndexOf('J');
        System.out.println(result);
        result = Iprac.lastIndexOf('a');
        System.out.println(result);
        result = Iprac.lastIndexOf('j');
        System.out.println(result);
        result = Iprac.lastIndexOf("ava");
        System.out.println(result);
        result = Iprac.lastIndexOf("Java");
        //contains
        String Cprac = "Learn Java";
        Boolean Cresult;
        Cresult =Cprac.contains("Java");
        System.out.println(Cresult);
        Cresult = Cprac.contains("Python");
        System.out.println(Cresult);
        Cresult = Cprac.contains("");
        System.out.println(Cresult);
        //replace
        String rep1 = "abc cba";
        System.out.println(rep1.replace('a', 'z'));
        System.out.println("Lava".replace('L' ,'J'));
        System.out.println("Hello".replace('4', 'J'));
        System.out.println(rep1.replace("C++", "Java"));
        System.out.println("aa bb aa zz".replace("C++", "C"));
        //replace all
        String re ="Java123is456fun";
        String regex = "\\d+";
        System.out.println(re.replaceAll(regex, " "));
        //equals
        String ep = "PerScholas";
        String ep2 = "PerScholas";
        String ep3 = new String ("PerScholas");
        String e4  = "Teksystem";
        System.out.println(ep.equals(ep2));
        System.out.println(ep.equals(ep3));
        System.out.println(ep.equals(e4));
        //==
        String equals = "PerScholas";
        String equals2 = "PerScholas";
        String equals3 = new String("PerScholas");
        System.out.println(equals==equals2);
        System.out.println(equals==equals3);
        //compare
        String c = "PerScholas";
        String c2 = "PerScholas";
        String c3 = "PerSchola";
        String c4 = "PerScholasX";
        System.out.println(c.compareTo(c2));
        System.out.println(c.compareTo(c3));
        System.out.println(c.compareTo(c4));



    }
}
