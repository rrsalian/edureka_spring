package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("geometryshape")
public class GeometryShape {
    
    @Value("#{square.calculateArea(8,5)}")
    private int squareArea;

    @Value("#{circle.calculateArea(7)}")
    private int circleArea;

    public int getSquareArea() {
        return squareArea;
    }

    public int getCircleArea() {
        return circleArea;
    }    
}
