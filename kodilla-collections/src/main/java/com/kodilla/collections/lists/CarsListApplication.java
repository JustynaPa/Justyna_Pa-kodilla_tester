package com.kodilla.collections.lists;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Hyundai;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(100));
        cars.add(new Ford(110));
        cars.add(new Hyundai(120));
        cars.add(new Hyundai(130));
        Car hyundai = new Hyundai(140);
        cars.add(hyundai);
        cars.add(new Opel(140));
        cars.add(new Opel(150));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("=========================================");
        cars.remove(2);
        cars.remove(hyundai);

        System.out.println("The size of list is: " + cars.size());
        System.out.println("=========================================");


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

    }

}
