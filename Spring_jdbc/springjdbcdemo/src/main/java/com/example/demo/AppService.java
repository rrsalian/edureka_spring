package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class AppService {
    @Autowired
    AppDAO appDAO;

    public int saveOrders(Orders orders) {
        return appDAO.saveOrders(orders);
    }

    public int saveCustomer(Customer customer) {
        return appDAO.saveNewCustomer(null);
    }

    public int saveCustomer1(Customer customer) {
        return appDAO.saveNewCustomer1(null);
    }

    public int updateCustomer(Customer customer) {
        return appDAO.updateCustomer(customer);
    }
}
