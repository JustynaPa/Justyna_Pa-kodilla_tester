package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(4);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area = a^2");

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = 4a");

    }
}
