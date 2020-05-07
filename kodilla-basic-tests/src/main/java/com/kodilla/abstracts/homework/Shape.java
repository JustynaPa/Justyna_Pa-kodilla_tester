package com.kodilla.abstracts.homework;

public abstract class Shape {

int wallsQuantity;

    public Shape(int wallsQuantity) {
        this.wallsQuantity = wallsQuantity;
    }

    public abstract void surfaceArea();

    public abstract void perimeter();

}
