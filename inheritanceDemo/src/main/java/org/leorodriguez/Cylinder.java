package org.leorodriguez;

import java.awt.*;

public class Cylinder extends circle {
    private final double PI = Math.PI;

    public Cylinder(double radius, double height) {
        super(radius, height);
    }
    public Cylinder(double radius) {
        super(radius);
    }
    public double getVolumne() {
        return (PI * Math.pow(super.radius, 2)) * super.height;
    }
    public double getSurfaceArea() {
        return 2.0 * Math.PI*super.radius*super.height;
    }
    public void displayShapeName(){
        System.out.println("Drawing a Cylinder for radius " + super.radius);
    }
    public String toString(){
        return "radius is: " + super.radius +"height is : " + super.height;
    }
}