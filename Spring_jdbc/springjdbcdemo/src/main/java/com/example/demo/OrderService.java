package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    AppDAO appDAO;

    public void saveOrderInvoices(Orders order, String invoiceId) {
        appDAO.saveOrders(order);
        appDAO.saveInvoice(invoiceId, order.getOrderId());
    }
}
