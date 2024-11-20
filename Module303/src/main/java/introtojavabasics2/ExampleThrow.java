package introtojavabasics2;

import java.io.IOException;
/*
The throws keyword is used to IMPLICITLY throw an exception; it is used mainly to throw
CHECKED EXCEPTIONS (Those that we are FORCED to throw); we use it with the METHOD
SIGNATURE; technically throws also does the same thing the try...catch does

The throw keyword is used to MANUALLY/EXPLICITLY throw an exception; we can then add our own
conditions and rules; we use it WITHIN the method body or any block of code.
We CANNOT THROW multiple exceptions with one THROW
 */

public class ExampleThrow {
    //declare exception using throws in the method signature
    public void testMethod(int num) throws IOException, ArithmeticException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException");
    }

    public static void main(String[] args) {
        //this try block calls the above method to handle the exception
        try{
            ExampleThrow obj=new ExampleThrow();
            obj.testMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }

    }
}