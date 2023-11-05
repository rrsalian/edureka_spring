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
    
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveOrders(Orders order) {
        int count = jdbcTemplate.update("insert into orders values(?,?,?,?)", order.getOrderId(), order.getOrderDesc(), order.getCustomerId(), order.getProductId());
        return count;                            
    }

    public int saveNewCustomer(Customer customer) {
        Map<String,Object> parameters = new HashMap<String, Object>();
        parameters.put("name", customer.getCustomerName());
        parameters.put("id", customer.getCustomerId());        
        parameters.put("city", customer.getCustomerCity());
        return namedParameterJdbcTemplate.update("insert into customer values(:id,:name,:city)", parameters);

    }

    public int saveNewCustomer1(Customer customer) {
        SqlParameterSource parameters = new MapSqlParameterSource()
                                        .addValue("id", customer.getCustomerId())
                                        .addValue("name", customer.getCustomerName())
                                        .addValue("city", customer.getCustomerCity());
        int count = namedParameterJdbcTemplate.update("insert into customer values(:id,:name,:city)", parameters);
        return count;                   
    }

    public int updateCustomer(Customer customer) {
        int count = jdbcTemplate.update("update customer set customer_city=? where customer_id=?",
                                        customer.getCustomerCity(), customer.getCustomerId());
        return count;                                        
    }
}
