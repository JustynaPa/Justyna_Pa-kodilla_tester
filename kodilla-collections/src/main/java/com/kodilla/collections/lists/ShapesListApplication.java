package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {

    public static void main(String[] args) {

        List<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10.00));
        shapes.add(new Square(5.00));
        shapes.add(new Square(1.00));

        for (Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());
        }

    }

}
