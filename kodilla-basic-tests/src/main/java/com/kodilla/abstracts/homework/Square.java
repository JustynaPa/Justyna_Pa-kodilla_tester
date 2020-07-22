package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int wallsQuantity) {
        super(wallsQuantity);
    }

    @Override
    public void surfaceArea() {
        System.out.println("...");
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = 4a");

    }
}
