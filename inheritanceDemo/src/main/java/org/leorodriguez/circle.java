package org.leorodriguez;

import java.awt.*;

public class circle  extends shape {
    protected double radius;
    private final double PI = Math.PI;

    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public  double getArea(){
        super.area =PI*Math.pow(this.radius,2);
        return super.area;
    }
    @Override
    public String toString(){
        return "Circle[ radius = " + radius + super.toString() + "]";
    }
}
