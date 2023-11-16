package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("acct")
public class Account {    
    public void addAccount() {
        //database logic to add account details in database
        System.out.println("Account details added");
    }

    public double getBalance() {        
        //database logic
        System.out.println("in get balance method");
        return 1000;
    }

    public void addLoanDetails(String loanId, int customerId) {
        // db logic
        System.out.println("loan details added to the customer with id " + customerId);
    }

    public List<String> getAccountNames() {
        //db logic
        System.out.println("in getAccountNames method");
        return Arrays.asList("account1","account2","account3");
    }

    public void getLoanData() throws Exception {
        // db logic
        throw new Exception("in getLoanData exception");
    }
}
