package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppService service = context.getBean("appService", AppService.class);
        
        List<Customer> customers = new ArrayList<>();
        for(int i=0; i < 1000; i++) {
            Customer customer = new Customer();
            customer.setCustomerId(i);
            customer.setCustomerName("testname" + i);
            customer.setCustomerCity("testcity" + i);
            customers.add(customer);
        }
        //service.saveCustomerDataAsBatch(customers);
        service.saveCustomerDataWithPartialBatch(customers, 200);
        context.close();
    }
}
