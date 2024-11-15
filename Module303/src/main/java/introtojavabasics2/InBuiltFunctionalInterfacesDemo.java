package introtojavabasics2;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class InBuiltFunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Example One
        Supplier<String> supplierObj = () -> "Per Scholas";
        System.out.println(supplierObj.get());
// Example two
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
// Print the random value using get()
        System.out.println(randomValue.get());
        // Creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        // Calling Predicate method
        System.out.println(lesserthan.test(10));
     /* apply(T t) -Applies this function to the
given argument, and then returns any type. */
        Function<Integer, Integer> f1 = i -> i*4;
        System.out.println(f1.apply(3));  //output 12
        Function<Integer, Integer> f2 = i -> i+4;
        System.out.println(f2.apply(3));  // output 7
        Function<String, Integer> f3 = s -> s.length();
        System.out.println(f3.apply("Peter"));  // output 5
    }
}