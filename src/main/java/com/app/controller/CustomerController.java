package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	/**
	 * Get list of customers.
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String getCustomerList(ModelMap model) {
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		customerList = customerService.findAllCustomer();
		
		model.addAttribute("customerList", customerList);
		
		return "customerList";
		
	}
	
	/**
	 * Save customer object.
	 * @param customer
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer, ModelMap model) {
		
		Customer cust =  customerService.saveCustomer(customer);
		
		model.addAttribute("customer", cust);
		
		return "customerList";
	}
	
}
