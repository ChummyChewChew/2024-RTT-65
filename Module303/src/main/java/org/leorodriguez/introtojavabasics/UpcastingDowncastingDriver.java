package org.leorodriguez.introtojavabasics;
/* Constructor - parent creates a new Parent Object
child() creates a new child object,
although we did not explicitly creat a constructor, it was created
in the background- a default no argument constructor
 */

public class UpcastingDowncastingDriver {
    public static void main(String[] args) {
        /*
        Remember, child () creates a new CHILD OBJECT
        create a new child and upgrade it to be a parent object
         */
        Parent parent = new Child(); //Using a child constructor// to make a child object, but upcasting to parent
        parent.name = "Java101";

        //Printing the values from the members (attributes and the methods)
        System.out.println(parent.name);
        parent.parentMethod();//This is upcasted as Parent, but it still has the child method because of the override

        //Down casting - implicit:
        //Child child = new Parent(); //A child is a parent, but parent is not a child

        //Downcasting Explicity
        Child child = (Child) parent;
        child.id =100;
        System.out.println(child.name);//What will be printed here? //Java 101
        System.out.println(child.id);
        child.parentMethod();//What will be printed here? -Child
    }
}
