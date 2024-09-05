package org.leorodriguez.introtojavabasics;
/*
This class IMPLEMENTS College - we prefer to say implements
since College does not have any IMPLEMENTATION
 */

public class CollegeImpl implements College {
    @Override
    public void getCourseName() {
        System.out.println("Core Java");
    }

    @Override
    public void getIAName() {
        System.out.println("Omar Pina");
    }

    @Override
    public void getInstructor() {
        System.out.println("Ezra Williams");
    }

    @Override
    public void getProgramDuration() {
        System.out.println("15 Weeks");
    }
}