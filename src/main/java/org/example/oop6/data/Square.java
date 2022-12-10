package org.example.oop6.data;

public class Square extends Rectangle{

    private double side;

    public Square(double side){
        super(side, side);
        this.side=side;
    }

    @Override
    public double perimeter() {
        return this.side*4;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    public double getSide() {
        return side;
    }
}
