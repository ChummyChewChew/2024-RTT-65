package introtojavabasics2;
import java.util.Scanner;
public class MainEntry  {
    Calc<Integer> add = new Calc<Integer>() {
        @Override
        public Integer compute(Integer[] values) {
            Integer sum = 0;
            for (Integer value : values) {
                sum += value;
            }
            return sum;
        }
    };
    Calc<Integer> subtract = new Calc<Integer>() {
        @Override
        public Integer compute(Integer[] values) {
            Integer sum = 0;
            for (Integer value : values) {
                sum -= value;
            }
            return sum;
        }
    };
    Calc<Integer> multiply = new Calc<Integer>() {
        @Override
        public Integer compute(Integer[] values) {
            Integer sum = 0;
            for (Integer value : values) {
                sum *= value;
            }
            return sum;
        }
    };
    Calc<Integer> divide = new Calc<Integer>(){
        @Override
        public Integer compute(Integer[] values){
            Integer sum =0;
            for (Integer value : values){
                sum /= value;
            }
            return sum;
        }
    };

    public static void main(String[] args) {
        MainEntry calculator = new MainEntry();
        Scanner sc = new Scanner(System.in);
        Integer answer;
        System.out.println("How many number do you want to compute?");
        int n = sc.nextInt();

        Integer [] values = new Integer [n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        System.out.println("What would you like to compute? The options are add, subtract, multiply, divide");
        String operator = sc.next();

        switch (operator) {
            case "add": answer = calculator.add.compute(values);
                System.out.println(answer);
            break;
            case "subtract": answer = calculator.subtract.compute(values);
            System.out.println(answer);
            break;
            case "multiply": answer = calculator.multiply.compute(values);
            System.out.println(answer);
            break;
            case "divide": if(n>2) {
                System.out.println("You can't do this!");
            }   answer = calculator.divide.compute(values);
                break;

            default:
                System.out.println("Nope, try again");
        }


    }
    }



