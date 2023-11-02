package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this is a sprong buitl in annotation to tell spring container
//that this class contains the bean definition and details
// Appcontext will consider this class as configuration for bean definitions
@Configuration
public class AppConfig {

    // By default beanid is overriden from employee to emp
    // this way we define a custom bean
    @Bean("emp")
    public Employee employee() {
        //Employee emp = new Employee();
        // manual way of injecting department bean in this property
        //emp.setDepartment(department());  // this is manual wiring 
        return new Employee();
    }

    // by default method name is the beanid and beanid is department with type Department
    @Bean
    public Department department() {
        return new Department();
    }

    //beanid is dept with type Department
    @Bean
    public Department dept() {
        return new Department();
    }
}
