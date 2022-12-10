package org.example.oop6.controller;

import org.example.oop6.data.Shape;
import org.example.oop6.service.ShapeRepository;
import org.example.oop6.view.Console;


public class Controller {

    private final Console console ;
    private final ShapeRepository repository;
    public Controller() {
        this.repository = new ShapeRepository();
        this.console = new Console();

    }

    public void showAllShapes(){
        console.showAllShapes(this.repository.getShapeList());
        console.showTotalArea(this.repository.allAreas());
    }

    public void addShape(Shape shape) {
        this.repository.add(shape);

    }

    public void getAllAreas(){
        this.repository.allAreas();
    }

    public void getAllPerimeters(){
        console.showTotalPerimeter(this.repository.allPerimeters());
    }
}
