package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan
public class AppConfig {
    // By default bean scope is Singleton else when specified it is prototype
    @Bean  ("emp") 
    @Scope("prototype") 
    public Employee employee() {        
        return new Employee();
    }

    @Bean("employee1") 
    @Scope("prototype") 
    public Employee employee1() {        
        return new Employee();
    }

    // here bean scope is singleton
    @Bean("department")
    //@Lazy   // this annotation will specify bean loading is Lay which means it will not execute
            // during appcontext creation. To test it comment and see the sout message from 
            // department bean creation
    public Department department() {   
        System.out.println("in department Bean definition");
        return new Department();
    }
}