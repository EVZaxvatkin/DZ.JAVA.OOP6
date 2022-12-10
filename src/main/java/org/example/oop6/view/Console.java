package org.example.oop6.view;

import org.example.oop6.data.Shape;

import java.util.List;
import java.util.logging.Logger;

public class Console {

    private final Logger log = Logger.getAnonymousLogger();

    public void showAllShapes(List<Shape> shapeList) {
        shapeList.forEach(System.out::println);
    }

    public void showTotalArea(Double totalArea) {
        System.out.println("Total area:" + totalArea);
    }

    public void showTotalPerimeter(Double totalPerimeter) {
        System.out.println("Total perimeter:" + totalPerimeter);
    }
}
