package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task ("do month's tabata training challenge", LocalDate.of(2020, 05, 30), LocalDate.of(2020, 06, 30)));
        tasksList.add(new Task ("spend more time with the cat", LocalDate.of(2020, 01, 01), LocalDate.of(2020, 05, 29)));
        tasksList.add(new Task ("to buy shoes", LocalDate.of(2020, 05,14), LocalDate.of(2020, 05, 17)));
        tasksList.add(new Task ("learn a course", LocalDate.of(2020, 04, 01), LocalDate.of(2020, 07, 22)));
        return tasksList;
    }
}
