package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.CategoryDao;
import com.training.core.model.CategoryModel;
import com.training.core.service.CategoryService;

@Service("categoryService")
public class DefaultCategoryService implements CategoryService
{
	@Resource(name="categoryDao")
	private CategoryDao categoryDao;
	
	@Override
	@Transactional
	public void createCategory(CategoryModel category) 
	{
		categoryDao.createCategory(category);
	}

}
