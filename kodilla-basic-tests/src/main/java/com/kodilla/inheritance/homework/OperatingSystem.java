package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int issueYear;

    public void turnOn() {
            System.out.println("Method turnOn");
    }

    public void turnOff() {
        System.out.println("Method turnOff");
    }

    public OperatingSystem(int issueYear) {
        this.issueYear = issueYear;
    }

    public void displayIssueYear() {
        System.out.println("The issue year is: " + issueYear);
    }

}
