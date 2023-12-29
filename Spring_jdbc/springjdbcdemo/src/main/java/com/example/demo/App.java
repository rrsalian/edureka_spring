package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //AppService service = context.getBean("appService", AppService.class);
        
        //from client application, calling the business method
        // Orders orders = new Orders();
        // orders.setOrderId("o2");
        // orders.setOrderDesc("Iphone 16");
        // orders.setCustomerId("C200");
        // orders.setProductId("p200");
        //service.saveOrders(orders);

        Customer customer = new Customer();
        customer.setCustomerId(3);
        customer.setCustomerName("Nizammudin");
        customer.setCustomerCity("Kerela");
        //service.saveCustomer(customer);
        //service.saveCustomer1(customer);
        
        Customer customer2 = new Customer();
        customer2.setCustomerId(3);
        customer2.setCustomerCity("chennai");
        //service.updateCustomer(customer2);

        OrderService orderService = context.getBean("orderService",OrderService.class);
        Orders orders = new Orders();
        orders.setOrderId("o6");
        orders.setOrderDesc("Laptop ACER");
        orders.setCustomerId("c600");
        orders.setProductId("P600");
        orderService.saveOrderInvoices(orders, "I600");

        context.close();
    }
}
