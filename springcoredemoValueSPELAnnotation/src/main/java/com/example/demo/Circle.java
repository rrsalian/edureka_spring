package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    public int calculateArea(int radius) {
        return radius * radius;
    }
}
