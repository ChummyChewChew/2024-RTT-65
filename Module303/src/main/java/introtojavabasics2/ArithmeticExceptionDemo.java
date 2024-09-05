package introtojavabasics2;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try{ //in here we put the code that MAY cause an exception
            int d = 0, n=5;
            //code that might cause an exception:
            int divideByZero = n / d;
        } catch (ArithmeticException e) {/* Here we put the code that
        HANDLES the exception - what happens IF an exception occurs
        It is executed ONLY if an exception occurs
        */
            System.out.println("ArithmeticException occured => "+e.getMessage());
            e.printStackTrace();
        } finally{ /*Executed whether an exception occurs
        It is executed AFTER TRY and if an exception occurs it is
        executed AFTER Try...Catch
        */
            System.out.println("Finally block");
        }
    }
}