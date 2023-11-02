package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        DatabaseConnector connector = context.getBean("databaseConnector", DatabaseConnector.class);
        System.out.println(connector.getHost() + " " + connector.getUserId());

    }
}
