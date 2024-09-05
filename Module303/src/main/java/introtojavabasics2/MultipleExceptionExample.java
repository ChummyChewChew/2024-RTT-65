package introtojavabasics2;

public class MultipleExceptionExample {
    public static void main(String[] args) throws NullPointerException {
        int[] nums = {3,0,7,9};
        try{
            // int x = nums[0] / nums[1]; // this will throw an ArithmeticException
            int y = nums[10]; // this would throw an ArrayIndexOutOfBoundsException
            String s = null;
            s.length(); // this will throw Nullpointexception
        } catch (ArithmeticException eAri){
            System.out.println("Execution caught: numerator must be greather then Zero " + eAri);
            eAri.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException eArr){
            System.out.println("Execution caught: You are exceed the array size " + eArr);
            eArr.printStackTrace();
        } catch (Exception e){
            System.out.println("Execution caught: You got Error please try again" + e);
        }
        finally {
            System.out.println("finally block us always execute");
        }
    }


}