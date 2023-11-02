package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);        
        System.out.println("After Application Context");
        Employee emp = context.getBean("emp", Employee.class);
        emp.setEmpId("E100");
        emp.setEmpName("Rajesh");
        System.out.println(emp);

        Employee emp1 = context.getBean("emp", Employee.class);
        System.out.println(emp1);

        Employee emp2 = context.getBean("employee1", Employee.class);
        System.out.println(emp2);

        Employee emp3 = context.getBean("employee1", Employee.class);
        System.out.println(emp3);

        Department dept = context.getBean("department", Department.class);
        dept.setDeptId("d100");
        dept.setDeptName("IT Department");

        Department dept1 = context.getBean("department", Department.class);

        System.out.println(dept);
        System.out.println(dept1);
        
    }  
}
