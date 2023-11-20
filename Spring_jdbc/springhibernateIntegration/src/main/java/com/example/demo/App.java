package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean("studentService", StudentService.class);
        
        //Reading student
        Student student = service.getStudentbyId(1);
        System.out.println(student.getStudentId() + " " + student.getStudentName());

        //creating student record
        Student student1 = new Student();
        student1.setStudentId(5);
        student1.setStudentName("Ram");
        student1.setStudentCity("Warren");
        service.createStudent(student1);
        context.close();
    }
}
