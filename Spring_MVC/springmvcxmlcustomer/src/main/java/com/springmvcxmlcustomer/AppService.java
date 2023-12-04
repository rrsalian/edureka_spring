package com.springmvcxmlcustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

	@Autowired
	CustomerDAO customerDAO;
	
	public List<Customer> getCustomers() {
		return customerDAO.getAllCustomers();
	}
}
