package org.leorodriguez.introtojavabasics;

public class AnimalDriver {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        // it’s fine because a Pig is an animal by inheritance
        Animal myPig = new Pig();  // Create a Pig object
        // it’s fine because a Dog is an animal by inheritance
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        Dog pitBull = new Dog();

        System.out.println(myAnimal instanceof Animal);    //true
        System.out.println(myAnimal instanceof Pig);  //false
        System.out.println(myPig instanceof Pig);  //True
        System.out.println(myPig instanceof Animal);  //True

        System.out.println(myAnimal instanceof Dog);  //false
        System.out.println(myDog instanceof Animal);  //True
        System.out.println(myDog instanceof Dog);  //True

        //IT IS IMPLIED - implicit upcasting:
       // Dog dog = new PitBull();//A PIT is a Dog
        Animal animal = new Dog(); //A dog is an animal

        //But we cannot do this://Implicit downcasting - not allowed in Java
        //PitBull pitBull1 =  new Dog();// every pitBull is a dog, but not every dog
        //is a pitbull
        Dog dog2 = new Dog();
        //Explicit downcasting:
        //PitBull pitBull2 = (PitBull) new Dog();

    }
}