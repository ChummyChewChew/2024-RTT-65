package JavaGlabsAndPAs;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListExample {
    public static void main(String[] args) {
        //Linked list declaration
        LinkedList<String> linkedList = new LinkedList<>();
        
        //Adding Elements
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");
        
        //Display Linked List Content
        System.out.println("Linked list content: "+linkedList);
        
        //Add first and Last Element
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("After addition: "+linkedList);
        
        //This is got to get and set values
        Object firstvar = linkedList.get(0);
        System.out.println("First Element: "+firstvar);
        linkedList.set(0, "Changed first element");
        Object firstvar2 = linkedList.get(0);
        System.out.println("New Element: "+firstvar2);

        //Remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked list after deletion of first and second element: "+linkedList);

        //Add to a pontoon and remove from a position
        linkedList.add(0,"New item");
        linkedList.remove(2);
        System.out.println("Final content: "+linkedList);

    }
}
