package com.example.springbasic.controller;

import com.example.springbasic.entities.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskManagerController {
    private int taskCounter = 0;
    private List<Task> taskList;
    TaskManagerController(){
        Task t1= new Task(taskCounter++,"make coffee");
        Task t2= new Task(taskCounter++,"make breakfast");
        Task t3= new Task(taskCounter++,"make juice");
        Task t4= new Task(taskCounter++,"make clean utensils");
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

    @PostMapping("/addTask")
    public Task addTask(@RequestParam String taskName){
        Task taskObj = new Task(taskCounter++,taskName);
        taskList.add(taskObj);
        return taskObj;
    }
}
