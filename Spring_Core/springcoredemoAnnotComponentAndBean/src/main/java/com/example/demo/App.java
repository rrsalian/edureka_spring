package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);        
        
        Employee emp = context.getBean("employee", Employee.class);
        emp.setEmpId("E100");
        emp.setEmpName("Rajesh");

        Employee emp1 = context.getBean("emp", Employee.class);

        Department dept = context.getBean("dept", Department.class);
        dept.setDeptId("d100");
        dept.setDeptName("IT Department");

        //System.out.println(emp.getEmpName() + " " + emp.getDepartment().getDeptName());
        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(dept);
        System.out.println(emp.getDept());
    }  
}
