package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Apllication {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student ("Bartosz", null));
        studentsList.add(new Student ("Alicja", null));
        studentsList.add(new Student ("Anna", new Teacher ("Remigiusz")));
        studentsList.add(new Student ("Wojciech", new Teacher ("Romuald")));

        for (Student student : studentsList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher("<undefined>"));
            System.out.println("Student is: " + student.getName() + "  //  Teacher is: " + teacherName.getName());
        }
    }
}
