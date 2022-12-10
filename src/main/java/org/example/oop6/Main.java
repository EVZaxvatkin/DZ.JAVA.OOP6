package org.example.oop6;

import org.example.oop6.controller.Controller;
import org.example.oop6.data.Circle;
import org.example.oop6.data.Rectangle;
import org.example.oop6.data.Square;
import org.example.oop6.data.Triangle;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller() ;
        controller.addShape(new Circle(4.0));
        controller.addShape(new Circle(8.0));
        controller.addShape(new Triangle(3.7, 5.4, 8.3));
        controller.addShape(new Rectangle(4.5, 6.0));
        controller.addShape(new Square(3.5));
        controller.showAllShapes();
        controller.getAllAreas();
        controller.getAllPerimeters();
    }

}