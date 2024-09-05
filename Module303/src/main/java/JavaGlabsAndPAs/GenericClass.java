package JavaGlabsAndPAs;

public class GenericClass <T>{
    private T data; //class variable of T type
    public GenericClass(T data) {//Constructor
        this.data = data;

    }
    public T getData() {
        return data;
    }

}
