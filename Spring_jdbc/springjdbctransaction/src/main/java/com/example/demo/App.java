package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean("orderService",OrderService.class);

        Orders orders = new Orders();
        orders.setOrderId("o5");
        orders.setOrderDesc("Laptop Sony");
        orders.setCustomerId("c300");
        orders.setProductId("P500");
        orderService.saveOrderInvoices(orders, "I300");

        context.close();
    }
}
