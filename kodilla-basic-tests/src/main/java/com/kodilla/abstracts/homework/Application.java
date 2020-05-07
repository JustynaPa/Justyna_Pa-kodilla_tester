package com.kodilla.abstracts.homework;

import java.util.concurrent.RecursiveAction;

public class Application {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.surfaceArea();
        triangle.perimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.surfaceArea();
        rectangle.perimeter();

        Square square = new Square();
        square.surfaceArea();
        square.perimeter();


    }



}
