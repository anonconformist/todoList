package com.springDemo.todoList;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@RestController
public class Controller {
    private ListInterface tasks;
    private ThirdParty thirdParty;

    @Autowired
    Controller(@Qualifier("shoppingList")ListInterface l, ThirdParty thirdParty) {
        this.tasks = l;
        this.thirdParty = thirdParty; // setting thirdparty
    }

    @GetMapping("/tasks")
    public ArrayList<String> GetAllTasks() {
        thirdParty.performAction(); // using thirdparty
        return this.tasks.getTasks();
    }
}