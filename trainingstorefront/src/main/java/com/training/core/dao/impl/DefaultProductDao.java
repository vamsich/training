package com.training.core.dao.impl;

import org.hibernate.SessionFactory;

import com.training.core.dao.ProductDao;
import com.training.core.model.ProductModel;

public class DefaultProductDao implements ProductDao
{
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void createProduct(ProductModel productModel) 
	{
		sessionFactory.getCurrentSession().save(productModel);
	}

}
