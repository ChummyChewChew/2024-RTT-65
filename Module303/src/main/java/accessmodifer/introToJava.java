package accessmodifer;

import org.leorodriguez.introtojavabasics.PracticeStudent; //It had to be imported, take note

public class introToJava {
    public static void main(String[] args) {
        PracticeStudent s1 = new PracticeStudent();
        //You can't access the s1.middleName because it is default, can only be accessed only in the package
        //EVEN IF THE PACKAGE IN IMPORTED
       // s1.
    }
}
