package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car extends Vehicle{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
