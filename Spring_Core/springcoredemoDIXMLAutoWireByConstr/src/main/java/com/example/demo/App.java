package com.example.demo;

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
        dept.setDeptName("Finance");

        HeadUnit hu = context.getBean("hu", HeadUnit.class);        
        hu.setId("P01");
        hu.setName("Product Unit");
        
        System.out.println(emp);
        System.out.println(dept);
        System.out.println(emp.getEmpId() + " " + emp.getDepartment().getHeadUnit().getName());
    }
}
