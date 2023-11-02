package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ParentConfig.class)
public class ChildConfig {

    @Autowired
    Vehicle vehicle;

    @Bean
    public Car car() {
        Car car = new Car();
        car.setMake(vehicle.getMake());
        //car.setModel("Toyota");        
        car.setColor("blue");
        return car;
    }
}
