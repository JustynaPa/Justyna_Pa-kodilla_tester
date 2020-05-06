package com.kodilla.inheritance.homework;

public class OperatingChild1 extends OperatingSystem {

    public OperatingChild1(int issueYear) {
        super(issueYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Method turnOn - extended text v.1");
    }

    @Override
    public void turnOff() {
        System.out.println("Method turnOff - extended text v.1");
    }

}
