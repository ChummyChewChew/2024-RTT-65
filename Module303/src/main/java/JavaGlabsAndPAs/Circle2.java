package JavaGlabsAndPAs;

public class Circle2 extends  Shape2{
    protected double radius;
    private final double PI = Math.PI;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }
    public double doublegetArea(){
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }
    @Override
    public void displayName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "]";
    }

}
