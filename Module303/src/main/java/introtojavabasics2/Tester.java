package introtojavabasics2;

public class Tester {
    public static void main(String[] args) {
        double number = 123.456789;
        String formattedNumber = String.format("%.2f", number);
        System.out.println(formattedNumber);
    }
}
