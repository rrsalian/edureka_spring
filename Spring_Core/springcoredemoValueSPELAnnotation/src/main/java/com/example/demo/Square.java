package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Square {

    public int calculateArea(int length, int width) {
        return length * width;
    }
}
