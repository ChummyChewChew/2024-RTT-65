package introtojavabasics2;

import org.leorodriguez.introtojavabasics.Student;

public class MyComparingClass {
    //Implementation - Anonymous class with anonymous constructor
    Generic_FunctionInterface<Integer> compareTwoVar = new Generic_FunctionInterface<Integer>() {
        @Override
        public Integer compare(Integer a, Integer b) {
            if (a>b)
                return a;
             else
                return b;

            }
        };
    Generic_FunctionInterface<String> StCompar = new Generic_FunctionInterface<String>() {
        public String compare(String a, String b) {
            if(a.equals(b)){
                return "True";
            } else return "False";
        }
    };
    Generic_FunctionInterface<Student> studentCompare = new Generic_FunctionInterface<Student>() {
        public Student compare(Student a, Student b) {
            if(a.equals(b))
                return a;
            else
                return b;
        }
    };

    public static void main(String[] args) {
        MyComparingClass mc = new MyComparingClass();
        int resultInteger = mc.compareTwoVar.compare(50, 50);
        System.out.println(resultInteger);
        System.out.println(resultInteger);
        Student a = new Student();
        Student b = new Student();
        //Student comparedStudent = compareObj.studentCompare.compare(a,b);



    }
}
