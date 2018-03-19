package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.ProductDao;
import com.training.core.model.ProductModel;
import com.training.core.service.ProductService;

@Service("productService")
public class DefaultProductService implements ProductService
{
	@Resource(name="productDao")
	private ProductDao productDao;
	
	
	@Override
	@Transactional
	public void createProduct(ProductModel product) 
	{
		productDao.createProduct(product);
	}
}

