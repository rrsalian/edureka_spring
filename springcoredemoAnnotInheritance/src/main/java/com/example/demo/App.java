package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext context = new ClassPathXmlApplicationContext("child-car-config.xml");
        Car car = context.getBean("car", Car.class);
        
        System.out.println(car.getMake() + " " + car.getModel() + " " + car.getColor());
    }
}
