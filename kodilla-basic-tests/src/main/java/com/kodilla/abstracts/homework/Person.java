package com.kodilla.abstracts.homework;

public class Person {


    String firstName;
    int age;
    String job;

    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Person joanna = new Person("Joanna", 36, "Nurse");
        Person kinga = new Person("Kinga", 39, "Teacher");
        Person agata = new Person("Agata", 50, "Denstist");


        Nurse nurse = new Nurse(4000, "care, injections");
        Run run = new Run();
        run.run(nurse);

        Teacher teacher = new Teacher(3500, "teaching");
        run.run(teacher);

        Dentist dentist = new Dentist(10000, "tooths treatment");
        run.run(dentist);


    }

    }






