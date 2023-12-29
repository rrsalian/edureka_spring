package com.example.demo;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/transactiondb");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(10);
        return dataSource;
    }

    @Bean 
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    } 
}
