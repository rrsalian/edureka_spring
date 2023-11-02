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

        Employee emp = context.getBean("emp",Employee.class);
        emp.setEmpId("E100");
        emp.setEmpName("Rajesh");

        Department dept = context.getBean("department", Department.class);
        dept.setDeptId("D100");
        dept.setDeptName("Fiannce");
        
        //emp.setDept(dept);  // this is manual DI using set method
        // DI using setter can be done using configuration as well using property name and ref
        System.out.println(emp);
        System.out.println(dept);
        System.out.println(emp.getDept());
    }
}
