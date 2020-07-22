package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle(int wallsQuantity) {
        super(wallsQuantity);
    }

    @Override
    public void surfaceArea() {
        System.out.println("...");
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = a+b+c");

    }
}
