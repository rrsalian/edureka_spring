package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppService {
    @Autowired
    AppDAO appDAO;

    public int saveOrders(Orders orders) {
        return appDAO.saveOrders(orders);
    }
 
    public int saveCustomer(Customer customer) {
        return appDAO.saveNewCustomer(customer);
    }

    public int saveCustomer1(Customer customer) {
        return appDAO.saveNewCustomer1(customer);
    }

    public int updateCustomer(Customer customer) {
        return appDAO.updateCustomer(customer);
    }
/*
    public int saveCustomerDataAsBatch(List<Customer> customers) {
        return appDAO.saveCustomerDataAsBatch(customers);
    }
    */
}
