package introtojavabasics2;
import org.leorodriguez.introtojavabasics.Student;

public class GenericMethodDriver {
    public static void main(String[] args) {
        GenericMethodExample ge = new GenericMethodExample();
        ge.printValues(43);//Integer
        ge.printValues("Ezra");
        ge.printValues(4.5);//Double
        ge.printValues('E');//Character
        ge.printValues(true);//Boolean
        ge.printValues(new Student());

        GenericMethodExample.staticdisplayData(43);
        GenericMethodExample.staticdisplayData(4.5);
        GenericMethodExample.staticdisplayData('E');
        GenericMethodExample.staticdisplayData(true);
        GenericMethodExample.staticdisplayData(false);
        Student student = new Student();
        GenericMethodExample.staticdisplayData(student);

        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'J', 'A', 'V', 'A'};
        System.out.println( "Printing Integer Array" );
        ge.printArray( intArray  );
        System.out.println( "Printing Character Array" );
        ge.printArray( charArray );

    }
}