package org.example.oop6.data;

public class Triangle extends Polygon {
    double first;
    double second;
    double third;

    public Triangle(double first, double second, double third){
        this.first=first;
        this.second=second;
        this.third=third;
    }

    @Override
    public double perimeter() {
        return this.first+this.second+this.third;
    }

    @Override
    public double getArea() {
        double p = (this.first + this.second + this.third) / 2;
        return Math.sqrt(p * (p - first) * (p - second) * (p - third));
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", area=" + getArea() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
