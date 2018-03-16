package com.training.core.dao.impl;

import org.hibernate.SessionFactory;

import com.training.core.dao.CustomerDao;
import com.training.core.model.CustomerModel;

public class DefaultCustomerDao implements CustomerDao
{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveCustomer(CustomerModel customerModel) 
	{
		sessionFactory.getCurrentSession().save(customerModel);
	}

}
