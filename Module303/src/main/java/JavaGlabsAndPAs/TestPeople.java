package JavaGlabsAndPAs;

public class TestPeople {
    public static void main(String[] args) {
        Person aperson = new Person("Fred");
        Boy jimmy = new Boy();
        Girl betty;
        betty = new Girl("Betty");
        System.out.println(aperson);
        System.out.println(aperson.talk());
        System.out.println(aperson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());

        System.out.println((((Boy)aperson).talk()));

    }
}
