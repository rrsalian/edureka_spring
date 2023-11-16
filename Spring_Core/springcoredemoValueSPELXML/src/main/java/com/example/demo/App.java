package com.example.demo;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

        Student ob =  (Student) context.getBean("student");

        System.out.println(ob.getName() + " - " + ob.getId());
        System.out.println(ob.getHostel().getHostelName() + " - " + ob.getCurrentCity());
        
    }
}
