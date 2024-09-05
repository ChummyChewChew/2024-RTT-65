package JavaGlabsAndPAs;
import java.util.ArrayList;
import java.util.List;

public class GlabCreatArrayListExample {
    public static void main(String[] args) {
        //Creating an ArrayList of Strings
        List<String> animals = new ArrayList<>();
        //Adding emlements
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        //Adding an element at a particular index in a ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);


    }
}
