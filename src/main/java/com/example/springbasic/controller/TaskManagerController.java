package com.example.springbasic.controller;

import com.example.springbasic.entities.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskManagerController {
    private List<Task> taskList;
    TaskManagerController(){
        Task t1= new Task(1,"make coffee");
        Task t2= new Task(2,"make breakfast");
        Task t3= new Task(3,"make juice");
        Task t4= new Task(4,"make clean utensils");
        taskList=new ArrayList<>();
        taskList.add(t1);
        taskList.add(t2);
        taskList.add(t3);
        taskList.add(t4);
    }

    @GetMapping("/getTasks")
    public List<Task> getAllTaskList(){
        return taskList;
    }
}
