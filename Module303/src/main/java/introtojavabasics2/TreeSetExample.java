package introtojavabasics2;

import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();
        // Using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        //Addition of duplicate elements
        evenNumbers.add(2);
        evenNumbers.add(4);

        System.out.println("After adding 2 and 4 again TreeSet: " + evenNumbers);
        //Addition of null values - gives a null pointer exception
        //evenNumbers.add(null);
        // Using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);


    }
}