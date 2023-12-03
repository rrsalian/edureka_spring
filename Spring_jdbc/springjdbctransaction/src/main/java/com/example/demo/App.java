package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean("orderService",OrderService.class);

        Orders orders = new Orders();
        orders.setOrderId("o8");
        orders.setOrderDesc("Laptop Sony");
        orders.setCustomerId("c800");
        orders.setProductId("P800");
        orderService.saveOrderInvoices(orders, "I800");

        context.close();
    }
}
