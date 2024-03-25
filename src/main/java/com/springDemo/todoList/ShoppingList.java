package com.springDemo.todoList;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ShoppingList implements ListInterface {
    private ArrayList<String> tasks = new ArrayList<>();

    ShoppingList() {
        this.tasks.add("Vegetables");
        this.tasks.add("Flour");
    }

    public ArrayList<String> getTasks() {
        return this.tasks;
    }
}