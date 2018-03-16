package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CustomerDao;
import com.training.core.model.CustomerModel;

@Repository("customerDao")
public class DefaultCustomerDao implements CustomerDao
{
	@Resource(name="sessionFactory")
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
