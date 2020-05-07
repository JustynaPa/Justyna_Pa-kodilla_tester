package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    String Kinga;

    public Teacher(int salary, String responsibilities) {
        super( 3500, "teaching");
    }

    @Override
    public void workerName() {
        System.out.println("Kinga");
    }


}
