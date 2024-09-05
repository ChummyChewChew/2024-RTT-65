package org.leorodriguez.introtojavabasics;
//Difference between overloading and overriding
//Overloading is compile time based polymorphism
//Overriding is a run time based polymorphism
//Overloading is creating multiple signatures
//Overriding is creating a method with the same name to override the parent class
public class HumanBeingRunner {
    public static void main(String[] args) {

        //Creat an object of type HumanBeing (sub/child/derived)
        HumanBeing HObj = new HumanBeing(" Mr best");
        //Access field of a super/parent/base class - LivingThing
        //HObj.name = "Mr Best";
        HObj.display();

        //Call the method of the superclass using object of a subclass type

        HObj.eat();
        HObj.communication();

        //Another object
        HumanBeing HObj2 = new HumanBeing(" Mr Worst");
        HObj2.eat();

        //Static variables belong directly to the class, not the object where it was created
        HumanBeing.orginazationName= "Per Scholas";
        HObj.display();
        HObj2.display();
        HumanBeing.orginazationName ="Per Scholas 2.0";
        HObj.display();
        HObj2.display();



    }
}
