package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DatabaseConnector connector = context.getBean("databaseConnector", DatabaseConnector.class);
        System.out.println(connector.getHost() + " " + connector.getUserId());

    }
}
