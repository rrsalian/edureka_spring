package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this is a sprong buitl in annotation to tell spring container
//that this class contains the bean definition and details
// Appcontext will consider this class as configuration for bean definitions
@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        Employee emp = new Employee();
        // manual way of injecting department bean in this property
        emp.setDepartment(department());
        return emp;
    }

    @Bean
    public Department department() {
        return new Department();
    }
}
