package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Hyundai;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {

        Random random = new Random();
            int drawnCarKind = random.nextInt(3);
            Car randomCar = new Ford(100);

            if (drawnCarKind == 0)
                randomCar = new Ford(100);
            else if (drawnCarKind == 1)
                randomCar = new Hyundai(120);
            else
                randomCar = new Opel(140);
            for(int i=0; i < random.nextInt(4); i++)
                randomCar.increaseSpeed();
            return randomCar;
    }

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(14) + 1];
        for( int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

}
