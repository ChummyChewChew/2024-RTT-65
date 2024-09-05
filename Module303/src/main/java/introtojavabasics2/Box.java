package introtojavabasics2;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> values;
    public Box() {
        values = new ArrayList<T>();
    }
    public void add(T value){
        values.add(value);
    }
    public List<T> get () {
        return values;
    }

    public static class BoxDriver{
        public static void main(String[] args) {
            // creating  Generic Instance for box
            Box<Integer> intBox = new Box<Integer>();
            intBox.add(12);
            intBox.add(24);
            intBox.add(42);
            intBox.add(45);
            System.out.println(intBox.get());

// creating  Generic Instance for box
            Box<Float> floatBox = new Box<Float>();
            floatBox.add(12.3f);
            floatBox.add(18.5f);
            floatBox.add(120.45f);
            floatBox.add(85.4f);
            System.out.println(floatBox.get());

        }
    }

}