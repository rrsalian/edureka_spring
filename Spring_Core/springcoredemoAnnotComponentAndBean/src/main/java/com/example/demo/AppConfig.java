package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan
public class AppConfig {

    // Spring container will give preference to @Bean 
    // even when @Component is present
    @Bean   
    public Employee employee() {
        System.out.println("from the bean Employee"); 
        return new Employee();
    }
}
