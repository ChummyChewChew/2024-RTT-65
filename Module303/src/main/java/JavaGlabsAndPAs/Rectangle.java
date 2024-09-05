package JavaGlabsAndPAs;

public class Rectangle extends Shape {
    public Rectangle (String color){
        super(color);
    }
    public Rectangle(){

    }
    public Rectangle (String color, double area, double base, double width, double height){
        super(color, area, base, width, height);
    }
    @Override
    public void setBase(double base) {
        super.base = base;
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
    }
    @Override
    public double getArea(){
        return  width*height;
    }
    public double perimeter(){
        super.area = super.width*super.height;
        return super.area;
    }
    //Overriding methods of base class with different implications
    @Override
    public void displayName(){
        System.out.println("I am a Rectangle");
    }
    //Return a self descriptive string
    @Override
    public String toString(){
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";

    }
}
