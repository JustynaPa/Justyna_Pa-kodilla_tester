package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(4);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area = ab");

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = 2a+2b");

    }
}
