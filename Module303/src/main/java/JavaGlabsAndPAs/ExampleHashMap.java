package JavaGlabsAndPAs;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        /*HashMap <Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");
        System.out.println(languages);
        String value = languages.remove(2);
        System.out.println("Removed " + value);
        System.out.println(languages); */

        /*HashMap<String, String>  newHashMap = new HashMap<>();
        //Assigning a key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original HashMap: " + newHashMap);
        //Size
        System.out.println("Size "+ newHashMap.size());
        //Copying
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("Copied HashMap: " + copyHashMap);
        //Remove num key
        String nullKey = copyHashMap.remove(null);
        System.out.println("Null Key: " + nullKey);
        System.out.println("Size "+ copyHashMap.size());
        System.out.println("Size "+ newHashMap.size()); */

        /*TreeMap <String, Integer> numbers = new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println(numbers);
        //Remove with single parameter
        int value = numbers.remove("two");
        System.out.println("Removed value: " + value);
        //Remove with two
        boolean result = numbers.remove("three",3);
        System.out.println("Is it three removed?"+ result);
        System.out.println("Updated map "+numbers); */

        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap "+ numbers);

        //FirstKey
        String firstKey = numbers.firstKey();
        System.out.println("First "+firstKey);
        //LastKey
        String lastKey = numbers.lastKey();
        System.out.println("Last "+lastKey);
        //FirstEntry
        System.out.println(numbers.firstEntry());
        //Last Entry
        System.out.println(numbers.lastEntry());
    }
}
