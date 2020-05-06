package com.kodilla.inheritance.homework;

public class OperatingChild2 extends OperatingSystem {

    public OperatingChild2(int issueYear) {
        super(issueYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Method turnOn - extended text v.2");
    }

    @Override
    public void turnOff() {
        System.out.println("Method turnOff - extended text v.2");
    }
}
