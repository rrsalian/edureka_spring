package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AppService {
    @Autowired
    AppDAO appDAO;

    //@Transactional
    public void saveCustomerDataAsBatch(List<Customer> customers) {
        appDAO.saveCustomerDataAsBatch(customers);
    }

    public void saveCustomerDataWithPartialBatch(List<Customer> customers, int batchSize) {
        appDAO.saveCustomerDataWithPartialBatch(customers, batchSize);
    }
    
}
