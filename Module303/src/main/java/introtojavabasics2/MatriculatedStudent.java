package introtojavabasics2;
//This class is a SUBCLASS, CHILD CLASS of Student

import org.leorodriguez.introtojavabasics.MethodDemo;
import org.leorodriguez.introtojavabasics.Student;

public class MatriculatedStudent extends Student {
    public static void main(String[] args) {
        MatriculatedStudent ms = new MatriculatedStudent();
        //   ms.age=20;
        MethodDemo.add(100,200);
    }
}