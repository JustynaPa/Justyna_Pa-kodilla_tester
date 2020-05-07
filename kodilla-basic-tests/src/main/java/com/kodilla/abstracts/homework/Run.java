package com.kodilla.abstracts.homework;

public class Run {

    public void run(Job job) {

        System.out.println("These responsibilities: " + job.getResponsibilities() + " are dedicated for person below: ");
        job.workerName();
    }
}
