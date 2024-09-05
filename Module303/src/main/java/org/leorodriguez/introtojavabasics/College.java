package org.leorodriguez.introtojavabasics;
/*
Interfaces - a stricter version of an abstract class
An abstract class - both concrete and regular methods but in an interface
ALL the methods are abstract (exception of default methods)
You also CANNOT instantiate an interface
Use the implements keyword for the class that implements the interface
 */
public interface College {
    // All variables are by default public, static and final
    String COLLEGENAME2 = "Per Scholas";
    String Address = "23-66ST";

    void getCourseName();
    void getIAName();
    void getInstructor();
    void getProgramDuration();

}