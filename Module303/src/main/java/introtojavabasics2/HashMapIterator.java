package introtojavabasics2;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        // create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        // iterate through keys only
        System.out.println("Keys: ");
        for (Integer key : languages.keySet()) {
            System.out.println(key);
        }
        // iterate through values only
        System.out.println("\nValues: ");
        for (String value : languages.values()) {
            System.out.println(value);
        }

        // iterate through key/value entries
        System.out.println("\nEntries: ");
        for (Map.Entry<Integer, String> entry : languages.entrySet()) {
            System.out.println(entry);
        }
    }

}