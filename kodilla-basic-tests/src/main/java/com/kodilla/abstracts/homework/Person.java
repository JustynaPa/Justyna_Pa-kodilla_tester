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

    public static void main(String[] args) {

        Nurse nurse = new Nurse();
        Teacher teacher = new Teacher();
        Dentist dentist = new Dentist();

        Person joanna = new Person("Joanna", 23, nurse);
        Person kinga = new Person("Kinga", 37, teacher);
        Person agata = new Person("Agata", 50, dentist);

        System.out.println(joanna.getFirstName() + " Responsibilities are: " + joanna.job.getResponsibilities());
        System.out.println(kinga.getFirstName() + " Responsibilities are: " + kinga.job.getResponsibilities());
        System.out.println(agata.getFirstName() + " Responsibilities are: " + agata.job.getResponsibilities());

    }

    }






