package com.example.demo;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {
    public void addCustomer(int customerId) {
        //db logic
        System.out.println("in addcustomer method");
    }
}
