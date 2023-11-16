package com.example.demo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
//import org.springframework.jdbc.core.BatchPreparedStatementSetter;

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

    public int saveNewCustomer(Customer customer) {
        Map<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("name", customer.getCustomerName());
        parameters.put("id", customer.getCustomerId());        
        parameters.put("city", customer.getCustomerCity());
        int count = namedParameterJdbcTemplate.update("insert into customer values(:id,:name,:city)", parameters);
        System.out.println("Customer Saved from DAO saveNewCusomer method,to database");
        return count;
    }

    public int saveNewCustomer1(Customer customer) {
        //sqlparamteresource is a spring specific class and behaves just like we did for Map above
        SqlParameterSource parameters = new MapSqlParameterSource()
                                        .addValue("id", customer.getCustomerId())
                                        .addValue("name", customer.getCustomerName())
                                        .addValue("city", customer.getCustomerCity());
        int count = namedParameterJdbcTemplate.update("insert into customer values(:id,:name,:city)", parameters);
        System.out.println("Customer Saved from DAO saveNewCusomer1 method, to database");
        return count;                  
    }

    public int updateCustomer(Customer customer) {
        int count = jdbcTemplate.update("update customer set customer_city=? where customer_id=?",
                                        customer.getCustomerCity(), customer.getCustomerId());        
        System.out.println("Customer Updated " + count);
        return count;
    }

    public int saveInvoice(String invoiceId, String orderId) {
        int count = jdbcTemplate.update("insert into invoice values(?,?) ", invoiceId, orderId);
        System.out.println("Invoice Added");
        return count;
    }
}
