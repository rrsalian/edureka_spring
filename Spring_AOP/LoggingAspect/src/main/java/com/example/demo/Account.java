package com.example.demo;

import org.springframework.stereotype.Component;

@Component("acct")
public class Account {    
    public void addAccount() {
        //database logic to add account details in database
        System.out.println("Account details added");
    }
}
