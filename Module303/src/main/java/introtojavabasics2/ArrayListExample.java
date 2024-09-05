package introtojavabasics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample { public static void main(String[] args) {
    ArrayList<String> Mylist = new ArrayList<String>();
    Mylist.add("New Jersey");
    Mylist.add("Dallas");
    Mylist.add("New York");
    Mylist.add("Chicago");
    Mylist.add("LA");
    System.out.println("Return boolean :" + Mylist.contains("Chicago"));
    System.out.println("Return boolean :" + Mylist.contains("chicago"));
    System.out.println("Return index value of Element :" + Mylist.indexOf("Chicago"));
    System.out.println("Returns the actual Element at the given index :" + Mylist.get(2));
    System.out.println("Returns the length of the arraylist :" + Mylist.size());
    // Remove the element at the given index.   Returns the removed element.
    // remove element at index 3
    String removedElement =  Mylist.remove(3);
    System.out.println("Removed Element: " + removedElement);
    // remove all elements
    Mylist.clear();
    System.out.println("ArrayList after clear(): " + Mylist);

    List<String> listObj = Arrays.asList("Java","Python","JavaScript");

    System.out.println(listObj);

    ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
    System.out.println(intList);

    ArrayList<String>  al = new ArrayList<>();
    al.add("Jack");
    al.add("Tyler");
    al.add("James");

    Iterator itr = al.iterator();

    while(itr.hasNext()) {//as long as there are more elements in the list
        System.out.println(itr.next());
    }

    for (String st: al){
        System.out.println(st);
    }



}

}