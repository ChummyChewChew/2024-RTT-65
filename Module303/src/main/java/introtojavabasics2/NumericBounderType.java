package introtojavabasics2;
/*
In Java, this is called UPPER BOUND because we are creating a boundary for all the class types
that can be implemented, and they have to be of the class itself or any of it's LOWER CLASSES (any
of its child classes; any of the classes that extend it)
So NUMBER is the UPPER BOUND - we can't cross it
If it extends it is pointing UP to it's SUPER CLASS
 */

import org.leorodriguez.introtojavabasics.Student;

import java.util.ArrayList;

public class NumericBounderType <T extends Number>{
    T data;

    public NumericBounderType(T data) {
        this.data = data;
    }

    public void display(){
        System.out.println(data);
    }
    //What kind of class is this? //a static class is nested but nonstatic is inner
    public class NumbericBounderDriver{
        public static void main(String[] args) {
            NumericBounderType<Integer> type1 = new NumericBounderType<>(100);
            type1.display();
            NumericBounderType<Double> type2 = new NumericBounderType<>(20.66);
            type2.display();
            NumericBounderType<Float> type3 = new NumericBounderType<>(134.77f);
            type3.display();
            NumericBounderType<Number> type4 = new NumericBounderType<>(3000);
            type4.display();
            //This will not work because Object is NOT a subclass of Number
            //In fact, it is a SUPER CLASS of Number and all classes
            //NumericBounderType<Object> type4
            //ArrayList class - the best example of generics:
            ArrayList<Double> doubles = new ArrayList<>();
            ArrayList<String> strings = new ArrayList<>();
            ArrayList<Student> students = new ArrayList<Student>();
        }
    }
}