package com.kodilla.abstracts.homework;

public class Dentist extends Job {

    String Agata;

    public Dentist(int salary, String responsibilities) {
        super(10000, "tooths treatment");
    }

    @Override
    public void workerName() {
        System.out.println("Agata");
    }


}
