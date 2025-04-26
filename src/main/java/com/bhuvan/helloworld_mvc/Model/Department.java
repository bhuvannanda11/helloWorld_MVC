package com.bhuvan.helloworld_mvc.Model;

import org.springframework.stereotype.Component;

@Component
public class Department {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
