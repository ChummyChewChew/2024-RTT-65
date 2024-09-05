package introtojavabasics2;

public class StudentInfo {
    public void checkEligibility(int StAge, double StGpa) {
        if(StAge <18 && StGpa <2)
        {
            throw  new ArithmeticException("Student is not eligible for registration");
        }
        else{
            System.out.println("Student is eligible for registration");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to registration");
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.checkEligibility(16,1.6);
        System.out.println("Have a nice day");
    }
}
