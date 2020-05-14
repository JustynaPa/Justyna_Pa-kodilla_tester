package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(140);
        doRace(ford);
        Hyundai hyundai = new Hyundai (120);
        doRace(hyundai);
        Opel opel = new Opel(100);
        doRace(opel);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("The " + car.getClass().getSimpleName()+ " speed is: " + car.getSpeed());
    }

}
