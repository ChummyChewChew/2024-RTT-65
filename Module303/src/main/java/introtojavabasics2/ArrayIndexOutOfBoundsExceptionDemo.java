package introtojavabasics2;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            String[] st = {"A", "B", "C", "D", "E"};
            st[11] = "X";
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("index position is not exist --> " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("This is the finally block");
        }

    }
}