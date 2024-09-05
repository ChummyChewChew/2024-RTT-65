package introtojavabasics2;

import org.leorodriguez.introtojavabasics.Student;

public class GenericsClassDriver {
    public static void main(String[] args) {
        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class again
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java");
        System.out.println("Generic Class returns: " + stringObj.getData());

        //Student:
        Student student = new Student("Justice","A","Davila",25,"123 ABC Lane",
                123456, 100,"Mrs. Justice");
        GenericsClass<Student> intObj2 = new GenericsClass<>(student);
        System.out.println("Generic Class returns: " + intObj2.getData());

    }
}