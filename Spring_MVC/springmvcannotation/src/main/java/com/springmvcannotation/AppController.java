package com.springmvcannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
	AppService appservice;

    @RequestMapping("/orders")
    public String getOrders() {
        // call, service logic
        return "orders";
    }

    @RequestMapping("/products")
    public String getProducts() {
        // call, service logic
    	System.out.println("products");
        return "products";
    }	
	
    @RequestMapping("/customers")
	public String getCustomers(ModelMap map) {
    	System.out.println("hi");
    	List<Customer> customers = appservice.getCustomers();
    	map.put("customers", customers);
		return "customers";
	}
}
