package JavaGlabsAndPAs;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
    public static void main(String[] args) {
        //Creat Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");
        //Unsorted
        System.out.println(linkedList);

        //Sorted List
        Collections.sort(linkedList);

        //sorted
        System.out.println(linkedList);

        //custom sorted
        Collections.sort(linkedList, Collections.reverseOrder());

        //Custom sorting
        System.out.println(linkedList);
    }
}
