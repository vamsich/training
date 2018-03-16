package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CustomerData;
import com.training.core.model.CustomerModel;
import com.training.core.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createCustomer(CustomerData customerData)
	{
		CustomerModel customer= new CustomerModel();
		customer.setFirstName(customerData.getFirstName());
		customer.setLastName(customerData.getLastName());
		customer.setEmail(customerData.getEmail());
		customer.setMobile(customerData.getMobile());
		customer.setPassword(customerData.getPassword());
		customerService.saveCustomer(customer);
	}
}
