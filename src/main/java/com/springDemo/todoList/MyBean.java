package com.springDemo.todoList;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyBean {

    @PostConstruct
    public void customInit() {
        // Custom initialization logic
    }

    @PreDestroy
    public void customDestroy() {
        // Custom destruction logic
    }
}
