package com.springmvcxml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
    @RequestMapping("/orders")
    public String getOrders() {
        // call, service logic
        return "orders";
    }

    @RequestMapping("/products")
    public String getProducts() {
        // call, service logic
        return "products";
    }
}
