package JavaGlabsAndPAs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CreatArrayListFromColletionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //Creat a array list from a collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumber = new ArrayList<>();
        nextFivePrimeNumber.add(13);
        nextFivePrimeNumber.add(17);
        nextFivePrimeNumber.add(19);
        nextFivePrimeNumber.add(23);
        nextFivePrimeNumber.add(29);

        //Adding the entire collion to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumber);
        System.out.println(firstTenPrimeNumbers);

        List<String> topCompanies = new ArrayList<>();
        //Checks if it's empty
        System.out.println("Is the topCompanies empty: " + topCompanies.isEmpty());
        topCompanies.add("Microsoft");
        topCompanies.add("Apple");
        topCompanies.add("Google");
        topCompanies.add("Facebook");
        topCompanies.add("Amazon");
        //Find the size
        System.out.println("Here are the top companies: " + topCompanies.size() + "in the world");
        System.out.println(topCompanies);

        //Get the element at the given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best company: " + bestCompany);
        System.out.println("Second Best company: " + secondBestCompany);
        System.out.println("Last company: " + lastCompany);

        //Modify the element at the given index
        topCompanies.set(4, "Wallmart");
        System.out.println("Modified top companies list: " + topCompanies);

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial list: " + programmingLanguages);

        //Remove the element at index 5
        programmingLanguages.remove(5);

        System.out.println("After removing 5 programming languages: " + programmingLanguages);

        //Remove the first occurrence of the given element from the ArrayList
        //The remove() method returns false if the element does not exist in the ArrayList
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After removing Kotlin programming languages: " + programmingLanguages);

        //Remove all the elements that exist in the given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("C");
        scriptingLanguages.add("C++");
        scriptingLanguages.add("Java");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removing scripting languages: " + scriptingLanguages);

        //Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clearing programming languages: " + programmingLanguages);

        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking bad");
        tvShows.add("Game of thrones");
        tvShows.add("Friends");
        tvShows.add("Prison Break");
        System.out.println("Using just a iterator");

        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }
        System.out.println("Using a iterator for each remaining method");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(System.out::println);

        System.out.println("Using a for each loop");
        for (String tvShow : tvShows) {
            System.out.println(tvShow);
        }
        System.out.println("Using a loop with a index");
        for (int i = 0; i<tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        System.out.println("Iterate iterator");
        ListIterator iterator = tvShows.listIterator();

        System.out.println("Using a while loop");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Elements backwards");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        //Check the array list for the element
        System.out.println("Does it contain bob? "+ names.contains("Bob"));

        //Find the first occurrence of a element
        System.out.println("Index of Steve "+ names.indexOf("Steve"));
        System.out.println("Index of Mark "+ names.indexOf("Mark"));

        //Find the index of the last occurrence of a ellement
        System.out.println("Last index of John "+ names.lastIndexOf("John"));
        System.out.println("Last index of Bill "+ names.lastIndexOf("Bill"));
    }
}
