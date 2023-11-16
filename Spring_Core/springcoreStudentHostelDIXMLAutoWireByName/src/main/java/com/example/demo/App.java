package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //TaxCalculator calculator = new TaxCalculator();
        //object creation should not be taken from client instead use IOC using spring 
        // so create an object of ApplicationContext(spring container/bean factory)
        //passing the xml config
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");

        Student student = context.getBean("student",Student.class);
        student.setId("s1");
        student.setName("Justin");

        Hostel hostel = context.getBean("hostel", Hostel.class);
        hostel.setHostelName("Top Grade Hostel");
        hostel.setCity("NY");        
        
        System.out.println(student);
        System.out.println(hostel);
        System.out.println(student.getName() + " " + student.getHostel().getHostelName());
    }
}
