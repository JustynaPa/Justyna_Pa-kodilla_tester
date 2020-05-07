package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    public Triangle() {
        super(3);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface area = 1/2ah");

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = a+b+c");

    }
}
