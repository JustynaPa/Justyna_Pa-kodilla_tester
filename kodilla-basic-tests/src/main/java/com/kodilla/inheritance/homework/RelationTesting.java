package com.kodilla.inheritance.homework;

public class RelationTesting {

    public static void main(String[] args) {
        OperatingSystem Windows10 = new OperatingSystem(2019);
        Windows10.turnOn();

        OperatingChild1 Windows12 = new OperatingChild1(2021);
        Windows12.turnOn();
        Windows12.turnOff();

        OperatingChild2 Windows14 = new OperatingChild2(2023);
        Windows14.turnOn();
        Windows14.turnOff();


        Windows14.displayIssueYear();
        Windows12.displayIssueYear();





    }
}
