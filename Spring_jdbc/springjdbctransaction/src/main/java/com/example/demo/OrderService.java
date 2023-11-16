package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class OrderService {
    @Autowired
    AppDAO appDAO;

    @Transactional  //part of spring framework to handle transaction
    public void saveOrderInvoices(Orders order, String invoiceId) {
        appDAO.saveOrders(order);
        appDAO.saveInvoice(invoiceId, order.getOrderId());
    }

}
