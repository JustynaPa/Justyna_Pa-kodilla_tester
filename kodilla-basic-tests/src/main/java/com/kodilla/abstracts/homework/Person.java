package com.kodilla.abstracts.homework;

public class Person {

    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPersonResponsibilities() {

        return job.getResponsibilities();
    }

    public Job getJob() {
        return job;
    }

    public static void main(String[] args) {

        Nurse nurse = new Nurse(2000, "care, injections");
        Teacher teacher = new Teacher(2500, "teaching");
        Dentist dentist = new Dentist(5000, "tooths treatment");

        Person joanna = new Person("Joanna", 23, nurse);
        Person kinga = new Person("Kinga", 37, teacher);
        Person agata = new Person("Agata", 50, dentist);

        System.out.println(joanna.getFirstName() + " Responsibilities are: " + joanna.getPersonResponsibilities());
        System.out.println(kinga.getFirstName() + " Responsibilities are: " + kinga.getPersonResponsibilities());
        System.out.println(agata.getFirstName() + " Responsibilities are: " + agata.getPersonResponsibilities());

    }

    }






