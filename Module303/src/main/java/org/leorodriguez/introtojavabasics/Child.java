package org.leorodriguez.introtojavabasics;
/*
This is called the Child/SUB/Derived class
Default access is also called package access
 */

public class Child extends Parent {
    int id;

    @Override
    void parentMethod() {
        System.out.println("This is the Method from the child class");
    }
}
