package org.leorodriguez.introtojavabasics;
/*
An abstract class MAY have both regular and abstract methods.
Differences between Concrete classes and Abstract classes:
.Concrete class - we DO NOT need to override methods - it's a choice but for the
Abstract class we have Abstract methods and they MUST be implemented in the child.
.A Concrete class can be instantiated (WE CAN CREATE OBJECTS/INSTANCES) of that class
however an Abstract Class CANNOT BE INSTANTIATED!
Similarity between Concrete Classes and Abstract Classes:
. WE use the extends keyword for the sub-classes of both.
WE are not allowed to instantiate an object of an abstract type (DIRECTLY) because
the class contains unimplemented methods.
Abstract methods CANNOT be private or protected because we NEED them to be accessed by the subclasses.
We MUST use the abstract keyword for the class to be an abstract class
 */

public abstract class AbstractStudent {
    static final protected String COLLEGENAME = "Per scholas";
    protected String username;
    protected String password;
    protected int rollNumber;

    // abstract method - method shells, definitions
    public abstract  void displayInformation();
    public abstract String[] getFullName(String[] fullname);

    // regular methods
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


}