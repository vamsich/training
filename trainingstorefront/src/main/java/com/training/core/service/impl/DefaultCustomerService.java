package com.training.core.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.training.core.dao.CustomerDao;
import com.training.core.model.CustomerModel;
import com.training.core.service.CustomerService;

@Service("customerService")
public class DefaultCustomerService implements CustomerService
{
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}


	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}


	@Override
	public void saveCustomer(CustomerModel customerModel) 
	{
		customerDao.saveCustomer(customerModel);
	}

}
