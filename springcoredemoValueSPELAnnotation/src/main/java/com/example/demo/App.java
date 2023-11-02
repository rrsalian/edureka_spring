package com.example.demo;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GeometryShape shape = context.getBean("geometryshape", GeometryShape.class);

        System.out.println(shape.getSquareArea() + " " + shape.getCircleArea());

        Properties pros = System.getProperties();

        System.getProperty("java.home");
        //pros.list(System.out);
    }
}
