package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate Homework edition";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("What we have to do", DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> testingList = taskListRepository.findByListName(listName);
        //Then
        Assert.assertEquals(1,testingList.size());
        //CleanUp
        int cleanId = testingList.get(0).getId();
        taskListRepository.deleteById(cleanId);

    }
}
