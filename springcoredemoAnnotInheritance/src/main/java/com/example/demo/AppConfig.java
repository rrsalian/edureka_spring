package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    
    @Bean
    public Car car() {
        Car car = new Car();        
        vehicle(car);
        car.setMake("Toyota");
        car.setColor("Blue");
        return car;
    }

    public void vehicle(Car car) {
        car.setMake("Generic Make");
        car.setModel("Generic Model");
    }
}
