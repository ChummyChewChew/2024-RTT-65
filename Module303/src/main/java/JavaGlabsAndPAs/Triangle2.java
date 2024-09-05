package JavaGlabsAndPAs;

public class Triangle2 extends Shape2 {
    public Triangle2() {
    }


    public Triangle2(String color) {
        super.color = color;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * super.base * super.height;
    }

    @Override
    public void displayName() {
        System.out.println("I am a triangle");
    }

    @Override
    public String toString() {
        return "Triangle[base=" + super.base + ",height=" + super.height + "," + super.toString() + "]";
    }


}