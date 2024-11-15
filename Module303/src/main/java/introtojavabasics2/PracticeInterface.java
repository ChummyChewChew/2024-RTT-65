package introtojavabasics2;

/*
Default methods (defender method or extension methods) and they are
methods created to be implemented automatically by the classes that
implement the interface without having to change functionality
directly in those implementing classes.
 */
public interface PracticeInterface {
    //In an interface it is inferred that this is static and final
    String name = "This is my PracticeInterface";
    //Abstract method:
    public String printMessage();
    //public void show();
    default void show(){
        System.out.println("All of us are implementing this automatically");
    }
}