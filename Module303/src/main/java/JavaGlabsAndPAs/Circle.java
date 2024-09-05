package JavaGlabsAndPAs;

public class Circle extends Shape {
    protected double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        //double area = PI* this.radius*this.radius
        super.area = PI * Math.pow(this.radius, 2);//Initialiizing value in parent
        //class variable
        return super.area;
    }
    @Override
    public void displayName(){
        System.out.println("Drawing a circle of radius "+ this.radius);
    }
    @Override
    public String toString() {
        return "Circle[ radius = "+ radius + super.toString() +"]";
    }
}
