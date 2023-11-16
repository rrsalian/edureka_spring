package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;    

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public int saveOrders(Orders order) {
        int count = jdbcTemplate.update("insert into orders values(?,?,?,?)", order.getOrderId(), order.getOrderDesc(), order.getCustomerId(), order.getProductId());
        System.out.println("Order Saved to database");
        return count;                            
    }

    public int saveInvoice(String invoiceId, String orderId) {
        int count = jdbcTemplate.update("insert into invoices values(?,?) ", invoiceId, orderId);
        System.out.println("Invoice Added");
        return count;
    }
}
