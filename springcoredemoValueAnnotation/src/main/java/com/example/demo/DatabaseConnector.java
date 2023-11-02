package com.example.demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConnector {

    private String host;
    private String userId;
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
