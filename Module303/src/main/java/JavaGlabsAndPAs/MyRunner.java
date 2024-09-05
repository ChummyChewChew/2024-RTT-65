package JavaGlabsAndPAs;

public class MyRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of a Circle "+c.getArea());

        //Example of object type casting
        //Declaration of object variable obj of the shape class

        //Shape sObj; //Object creation of the shape class
        Shape sObj = new Shape();
        sObj.displayName();
        System.out.println(sObj instanceof Shape);//True

        //Object creation of the circle class
        System.out.println("+++++++");

        //It's fine because a circle is a shape by inheritance
        Shape shapeCircleObj = new Circle(100);//Upcasting
        shapeCircleObj.displayName();
        System.out.println("Area of a Circle "+shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); //Run circle's toString
        //Use instanceof operator for validation
        System.out.println(shapeCircleObj instanceof Circle);//True
        System.out.println(sObj instanceof Circle);// False because shape is not a circle

        System.out.println("-------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //Upcasting
        shapeRectangleObj.displayName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of a Rectangle "+shapeRectangleObj.getArea());
        //Use instanceof for validation
        System.out.println(shapeCircleObj instanceof Rectangle);//true
        System.out.println(sObj instanceof Rectangle);//False because Shape is not a rectangle

        System.out.println("---------------");
        Shape shapeTriangleObj = new Triangle("Blue");//Upcasting
        shapeTriangleObj.displayName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setWidth(3);
        System.out.println("Area of a Triangle "+shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj); //Runs triangle's toString

        //Use instance of for validation
        System.out.println(shapeTriangleObj instanceof Triangle);//true
        System.out.println(sObj instanceof Triangle);//False
        System.out.println("---------------");
        Cylinder cylinderShape = new Cylinder(3);//Upcasting
        cylinderShape.displayName();
        cylinderShape.setHeight(3);
        System.out.println("Area of a Cylinder "+cylinderShape.doublegetVolume());
        System.out.println(cylinderShape);
    }
}
