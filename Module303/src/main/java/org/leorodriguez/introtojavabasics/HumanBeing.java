package org.leorodriguez.introtojavabasics;
//Inheritance is only one way
//Parent class can NOT inherent classes from child classes(Upcasting in a exeption)

public class HumanBeing extends LivingThing {
    static String orginazationName;
    public void display(){
        System.out.println("My name is"+super.name);
        super.eat(); //Parent to child// super undoes an override to access the parent class
        System.out.println("The name of my organization is "+ orginazationName);

    }
    public HumanBeing(String name){
        super(name); //Calls the parent constructor and do what it does
    }
    //Override the eat() method
    /*Overide is also another branch of Polymorphism. And essentially it is different
    from overloading because with overriding the METHOD HEADER, including
    the METHOD SIGNATURE has to be the EXACT replica of the METHOD HEADER
    int the parent class
     */
    @Override//This is not required, but it's good practice
    public void eat(){
        System.out.println("I enjoy eating pizza with soft drink.");
    }
    public void communication(){
        System.out.println("I can communicate with  language");
    }
}
