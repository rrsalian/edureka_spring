package com.example.demo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
  
    // batch updates - Full
    public void saveCustomerDataAsBatch(List<Customer> customers) {

        jdbcTemplate.batchUpdate("insert into newcustomer(customer_id,customer_name,customer_city) values(?,?,?)",
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, customers.get(i).getCustomerId()); // TODO Auto-generated method stub
                        ps.setString(2, customers.get(i).getCustomerName());
                        ps.setString(3, customers.get(i).getCustomerCity());
                    }
                    @Override
                    public int getBatchSize() {
                        System.out.println(customers.size());
                        return customers.size();
                    }
                });
    }

    // partial batch update
    public void saveCustomerDataWithPartialBatch(List<Customer> customers, int batchSize) {
        AtomicInteger commitCount = new AtomicInteger(0); // initialize the counter
        int[][] updatecounts = jdbcTemplate.batchUpdate(
                "insert into newcustomer(customer_id,customer_name,customer_city) values(?,?,?)", customers, batchSize,
                new ParameterizedPreparedStatementSetter<Customer>() {
                    @Override
                    public void setValues(PreparedStatement ps, Customer customer) throws SQLException {
                        // TODO Auto-generated method stub
                        ps.setInt(1, customer.getCustomerId());
                        ps.setString(2, customer.getCustomerName());
                        ps.setString(3, customer.getCustomerCity());
                        commitCount.incrementAndGet();
                        System.out.println("set values " + commitCount.get());
                    }
                    
                });
            System.out.println(updatecounts.length); // no of commits
    }
}
