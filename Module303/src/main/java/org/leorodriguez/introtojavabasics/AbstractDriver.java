package org.leorodriguez.introtojavabasics;

import java.util.Arrays;

public class AbstractDriver {
    public static void main(String[] args) {
        // Student student = new Student(); //
        /*
        Abstract classes THEMSELVES cannot be instantiated (we cannot create
        objects or instances DIRECTLY) from an Abstract Class
         */
        //  AbstractStudent abstractStudent = new AbstractStudent();
        AbstractStudent student = new StudentService();//Upcasting and it is FINE
        student.setUsername("Mike123");
        student.setPassword("password1234567");
        student.setRollNumber(0024);
        student.displayInformation();
        String[] name = {"Mike", "Gabriel"};
        System.out.println(Arrays.toString(student.getFullName(name)));

        StudentService studentService = new StudentService();
        studentService.getCourseName();
        studentService.getIAName();
        studentService.getInstructor();
        studentService.getProgramDuration();
        College collegeImpl = new CollegeImpl();//This is allowed
        //Cannot do this:
        //College college = new College();

    }
}