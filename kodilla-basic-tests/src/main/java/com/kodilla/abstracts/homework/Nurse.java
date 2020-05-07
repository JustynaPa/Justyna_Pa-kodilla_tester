package com.kodilla.abstracts.homework;

public class Nurse extends Job {


    public Nurse(int salary, String responsibilities) {
        super(4000, "care, injections");
    }


    @Override
    public void workerName() {
        System.out.println("Joanna");
    }


}
