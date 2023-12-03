package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
    
    private JdbcTemplate jdbcTemplate;

    public AppDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }        
    
    public int saveOrders(Orders order) {
        int count = jdbcTemplate.update("insert into orders values(?,?,?,?)", order.getOrderId(), order.getOrderDesc(), order.getCustomerId(), order.getProductId());
        System.out.println("Order Saved to database");
        return count;                            
    }

    public int saveInvoice(String invoiceId, String orderId) {
        int count = jdbcTemplate.update("insert into invoice values(?,?) ", invoiceId, orderId);
        System.out.println("Invoice Added");
        return count;
    }
}
