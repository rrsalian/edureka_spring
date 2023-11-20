package com.example.demo;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppService {
    //@Autowired // using constructor injection
    AppDAO appDAO;
    
    public AppService(AppDAO appDAO) {
        this.appDAO = appDAO;
    }

    public int getCustomerCount() {
        return appDAO.getCustomerCount();
    }
    
    public Customer getCustomerById(int id) {        
        return appDAO.getCustomerById(id);
    }

    public List<Customer> getAllCustomers() {        
        return appDAO.getAllCustomers();
    }
}
