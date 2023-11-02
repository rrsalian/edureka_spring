package com.example.demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        //TaxCalculator calculator = new TaxCalculator();
        //object creation should not be taken from client instead use IOC using spring 
        // so create an object of ApplicationContext(spring container/bean factory)
        //passing the xml config
        ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        
        Properties props = new Properties();
        //props.load(new FileInputStream("beanname.properties"));
        props.load(new FileInputStream("./demo/src/config/beanname.properties"));
        String beanname = props.getProperty("beanname");
        // then client asks the AppC, give me the object of the taxcalculator
        ITaxCalculator calculator = context.getBean(beanname,ITaxCalculator.class);
        double tax = calculator.calculateTax(200000);
        System.out.println(tax);
    }
}
