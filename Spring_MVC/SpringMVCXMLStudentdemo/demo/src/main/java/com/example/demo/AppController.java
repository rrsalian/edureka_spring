package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @RequestMapping("/orders")
    public String getOrders() {
        // call, service logic
        return "orders";
    }

    @RequestMapping("/products")
    public String getProducts() {
        // call, service logic
        return "products";
    }
    
    @RequestMapping("/showStudentRegForm")
    public String showRegForm(@ModelAttribute Student student) {
        // call, service logic
        return "student-registration-form";
    }

    @RequestMapping("/processForm")
    public String processRegForm(@ModelAttribute Student student) {
        // Call the service class, service will call dao class, in dao, we will use 
        //spring jdbc or hibernate to insert this data in database
        System.out.println(student.getFirstName() + " " + student.getAge());
        return "studentdetailsconfirmation";
    }

}
