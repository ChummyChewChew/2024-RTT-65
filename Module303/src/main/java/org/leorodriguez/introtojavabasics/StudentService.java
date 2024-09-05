package org.leorodriguez.introtojavabasics;
/*
SubClass of AbstractStudent
 */

public class StudentService extends AbstractStudent implements College {
    // Assume this gpa is coming from Database
    private double gpa = 4.2;

    @Override
    public void displayInformation() {
        System.out.println("Welcome to " + this.COLLEGENAME);
        System.out.println("Your username is " + this.username + " and password is " + this.password);
        System.out.println("Your roll number is " + this.rollNumber + " and You got  " + this.gpa);
    }

    @Override
    public String[] getFullName(String[] name) {
        String[] fullname = name;
        return fullname;
    }

    @Override
    public void getCourseName() {
        System.out.println("Full Stack Java development");
    }

    public void getIAName() {
        System.out.println("Do not Assign");
    }

    public void getInstructor() {
        System.out.println("Your Instructor name is James");
    }

    public void getProgramDuration() {
        System.out.println("Program Duration is approximately 15 week");
    }
}