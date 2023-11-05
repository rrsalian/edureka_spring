package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Account account = context.getBean("acct", Account.class);
        //from client application, calling the business method
        account.addAccount();
        context.close();
    }
}
