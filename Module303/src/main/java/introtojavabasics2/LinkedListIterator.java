package introtojavabasics2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("John");
        l.add("Sara");
        l.add("Susan");
        l.add("Betty");
        l.add("Nathan");
        System.out.println("The LinkedList elements are: ");
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}