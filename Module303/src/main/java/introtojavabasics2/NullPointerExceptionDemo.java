package introtojavabasics2;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr.equals null or works fine.
        try {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("hello"))
                System.out.print("Same");
            else
                System.out.print("Not Same");

        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught => " + e.getMessage());
            e.printStackTrace();
        }

    }
}