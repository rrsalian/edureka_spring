package com.springmvcxmlcustomer;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class CustomerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;    

    public List<Customer> getAllCustomers() {
        List<Customer> customers = jdbcTemplate.query("select * from customer", new CustomerRowMapper());
        return customers;
    }	
}
