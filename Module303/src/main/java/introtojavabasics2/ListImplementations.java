package introtojavabasics2;
/*
If we need an ordered collection of items, may contain duplicatates, then we
defeinitly need a list
 */

import org.leorodriguez.introtojavabasics.Student;

import java.util.ArrayList;

public class ListImplementations {
    /*
    The ArrayList is the most popular implementation of the List interface
    It is a DYNAMIC array- we can EXTEND and CONTRACT our arraylist as we see fit
    Extends the Iterable interface - we can use an iterable object to run through it
    It ALLOWS DUPLICATES and even NULL values
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>(24);// It's good to se a initial capacity because just adding make it reinitialize itself- less efficient
        ArrayList<Object> objects = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();
        Student student = new Student("John", "Bob", "Smith");
        Student student2 = new Student("Jane", "Doe", "Smith");
        Student student3 = new Student("John", "Doe", "Smith");
        Student student4 = new Student("Max", "Doe", "Smith");

        students.add(student);
        students.add(student2);
        System.out.println(student);
        int position = students.indexOf(student);
        int position2 = students.indexOf(student2);
        System.out.println(position);
        System.out.println(students.contains(student));
        students.remove(student);
        students.remove(position2);
        System.out.println(students);
        System.out.println(students.size());
        students.set(2, student);
        students.set(3, student4);
        System.out.println(students.isEmpty());
        System.out.println(students);
        //students.sort();

    }
}
