package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CategoryData;
import com.training.core.model.CategoryModel;
import com.training.core.service.CategoryService;

@Controller
@RequestMapping("/c")
public class CategoryController 
{
	@Resource(name="categoryService")
	private CategoryService categoryService;
	
	@RequestMapping(value="create", method= RequestMethod.POST)
	@ResponseBody
	public void createCategory(CategoryData categoryData)
	{
		CategoryModel category= new CategoryModel();
		category.setName(categoryData.getName());
		category.setDescription(categoryData.getDescription());
		category.setHasSubCategories(categoryData.getHasSubCategories());
		categoryService.createCategory(category);
	}
}
