package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;    


    public int getCustomerCount() {
        int count = jdbcTemplate.queryForObject("select count(*) from Customer", Integer.class);
        return count;
    }

    public Customer getCustomerById(int id) {
        Customer customer = jdbcTemplate.queryForObject("select * from customer where customer_id = ?", new CustomerRowMapper(),new Object[] {id});
        return customer;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customers = jdbcTemplate.query("select * from customer", new CustomerRowMapper());
        return customers;
    }
}
