package JavaGlabsAndPAs;

public class Shape {
    private String color;
    protected double area =1.0;
    protected double base = 1.0;
    protected double width = 1.0;
    protected double height = 1.0;
    //Construct a shape instance with y the color
    public Shape(String color) {
        this.color = color;
    }
    public Shape (){

    }
    //Construct  a shape instance with the given values
    public Shape(String color, double area, double base, double width, double height) {
        this.color = color;
        this.area = area;
        this.base = base;
        this.width = width;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //Return a self descriptive String
    @Override
    public String toString() {
        return "Shape[color"+ color+ "]";
    }
    //All shapes must have a getArea method
    public double getArea() {
        //There is a problem here
        //We need to return a value to compile the program
        System.out.println("Shape unknown! Cannot compute area");
        return 0;
}
    public void displayName(){
        System.out.println("I am a shape");
    }

}

