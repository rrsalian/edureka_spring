package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
public class AppConfig {
    //@value will inject the value of the key datasource.url from
    // db.properties file into the variable host
    @Value("${datasource.url}")
    private String host;

    //@value will inject the value of the key datasource.userId from
    // db.properties file into the variable userId
    @Value("${datasource.userId}")
    private String userId;

    //scope is prototype now as default is singletonwhen you do not specify scope    
    @Bean
    public DatabaseConnector databaseConnector() {
        DatabaseConnector databaseConnector = new DatabaseConnector();
        //databaseConnector.setHost("http://mydbdev.com");
        //databaseConnector.setUserId("user1");
        databaseConnector.setHost(host + '\n');
        databaseConnector.setUserId(userId);
        return databaseConnector;
    }    
}
