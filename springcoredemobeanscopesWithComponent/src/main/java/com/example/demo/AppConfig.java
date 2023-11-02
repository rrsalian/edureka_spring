package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(lazyInit = true)
public class AppConfig {
    // By default bean scope is Singleton else when specified it is prototype
    // @Bean  ("emp") 
    // @Scope("prototype") 
    // public Employee employee() {        
    //     return new Employee();
    // }

    // // here bean scope is singleton
    // @Bean("department")    
    // public Department department() {        
    //     return new Department();
    //}
}