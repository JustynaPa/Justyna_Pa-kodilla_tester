package com.kodilla.collections.interfaces.homework;

public class Hyundai implements Car {

    private int speed;

    public Hyundai(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed *= 1.15;
    }

    @Override
    public void decreaseSpeed() {
        speed *= 0.85;
    }
}
