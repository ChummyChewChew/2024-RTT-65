package org.leorodriguez.introtojavabasics;

public class PersonDriver {
    public static void main(String[] args) {
        Person mike =new Person ();
        mike.setName(" Mike") ;
        mike.setAge(22);
        mike.setCompany("Per Scholas") ;
        mike.setJob("Technical Instructor");
        mike.setHobby ("learn about Financial Engineering") ;
        mike.talkaboutYourself();
    }

}