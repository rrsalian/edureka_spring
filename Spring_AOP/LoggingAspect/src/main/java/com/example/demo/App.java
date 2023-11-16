package com.example.demo;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Account account = context.getBean("acct", Account.class);
        //from client application, calling the business method
        //account.addAccount();
        List<String> accountNames = account.getAccountNames();
        System.out.println(accountNames);
        account.addAccount();
        account.addLoanDetails("L1001", 101);
        Customer cust = context.getBean("cust", Customer.class);
        cust.addCustomer(200);
        double balance = account.getBalance();
        System.out.println("balance " + balance);        
        account.getLoanData();
        context.close();
    }
}
