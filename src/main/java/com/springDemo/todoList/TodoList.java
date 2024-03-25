package com.springDemo.todoList;

import java.util.ArrayList;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TodoList implements ListInterface {
    private ArrayList<String> tasks = new ArrayList<>();

    TodoList() {
        this.tasks.add("Finish homework");
        this.tasks.add("workout");
    }

    @Override
    public ArrayList<String> getTasks() {
        return this.tasks;
    }
}