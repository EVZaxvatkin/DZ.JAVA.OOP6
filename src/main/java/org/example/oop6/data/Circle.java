package org.example.oop6.data;

public class Circle extends Shape implements ILengthable {

    private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }


    @Override
    public double length() {
        return (Math.PI*2)*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                "area=" + getArea() + " " +
                "length=" + length() + " " +
                '}';
    }
}

