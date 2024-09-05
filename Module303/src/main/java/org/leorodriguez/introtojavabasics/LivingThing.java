package org.leorodriguez.introtojavabasics;

public class LivingThing {
    //Field and method of the parent class:
    /*
    Protcted means accessible within the class, the package, and subclasses outside the package
     */
    protected String name;



    public LivingThing(String name) {
        this.name = name;
    }
    public LivingThing (){

    }

    public void eat(){
        System.out.println("I can eat");
    }

    }

