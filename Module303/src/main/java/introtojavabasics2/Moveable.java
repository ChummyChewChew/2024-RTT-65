package introtojavabasics2;

public interface Moveable<T> {
    // abstract method one
    void move(T t, String locationCode);
    // abstract method two
    T getItemBeingMoved();
    // abstract method three
    String getLocationBeingMovedTo();
}