package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(int wallsQuantity) {
        super(wallsQuantity);
    }

    @Override
    public void surfaceArea() {
        System.out.println("...");
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = 2a+2b");
    }

}
