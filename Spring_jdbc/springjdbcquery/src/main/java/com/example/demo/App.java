package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService service = context.getBean("appService", AppService.class);
        
        //using queryforobject for count
        int count = service.getCustomerCount();
        System.out.println(count);
        
        // using queryforobject for getting a single object - customer record
        Customer customer = service.getCustomerById(2);
        System.out.println(customer.getCustomerName() + " " + customer.getCustomerCity());
        
        // using query for getting multiple records - All customer records
        List<Customer> customers = service.getAllCustomers();
        for(Customer customer2: customers) {
            System.out.println(customer2.getCustomerName() + " " + customer2.getCustomerCity());
        }

        context.close();
    }
}
