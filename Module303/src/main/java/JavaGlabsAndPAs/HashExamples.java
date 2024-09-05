package JavaGlabsAndPAs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashExamples {
    public static void main(String[] args) {
        /*HashSet<Integer> evenNumber = new HashSet<>();
        //Using add()
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet "+evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        //Using addAll()
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet "+numbers); */

        //Union of sets
       /* HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet "+evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2 "+numbers);
        //Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("HashSet3 "+numbers); */


        /*HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Hash one"+ primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Hash two"+ oddNumbers);

        //Comparing
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Differences "+primeNumbers);*/

        /*HashSet<String> hset = new HashSet<>();

        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grape");
        hset.add("Orange");
        hset.add("Fig");
        //Duplicates
        hset.add("Apple");
        hset.add("Mango");
        //Adding null values
        hset.add(null);
        hset.add(null);
        //Using enhances for
        for (String str : hset) {
            System.out.println("--> " + str);
        } */

        /* TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);

        //Call iterator
        Iterator<Integer> it = num_Treeset.iterator();
        System.out.print("TreeSet using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(", ");
        } */

        /*TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        //Using remove
        boolean value1= numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);

        //Using removeAll
        boolean value2= numbers.removeAll(numbers);
        System.out.println("Is all removed? " + value2); */

        /*TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet "+numbers);
        int first = numbers.first();
        System.out.println("first "+first);
        int last = numbers.last();
        System.out.println("last "+last); */


    }
}
